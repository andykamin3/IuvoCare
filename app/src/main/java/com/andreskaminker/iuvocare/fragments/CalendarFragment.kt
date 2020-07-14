package com.andreskaminker.iuvocare.fragments

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.andreskaminker.iuvocare.MainActivity
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.databinding.DayCalendarLayoutBinding
import com.andreskaminker.iuvocare.databinding.FragmentCalendarBinding
import com.andreskaminker.iuvocare.databinding.MonthLegendCalendarLayoutBinding
import com.andreskaminker.iuvocare.dtypes.*
import com.andreskaminker.iuvocare.dtypes.Config.daysOfWeekFromLocale
import com.andreskaminker.iuvocare.helpers.CalendarAdapter
import com.andreskaminker.iuvocare.helpers.DummyData
import com.andreskaminker.iuvocare.modules.FormatUtils
import com.andreskaminker.iuvocare.modules.mapToABP
import com.andreskaminker.iuvocare.modules.mapToABPMonth
import com.kizitonwose.calendarview.model.CalendarDay
import com.kizitonwose.calendarview.model.CalendarMonth
import com.kizitonwose.calendarview.model.DayOwner
import com.kizitonwose.calendarview.ui.DayBinder
import com.kizitonwose.calendarview.ui.MonthHeaderFooterBinder
import com.kizitonwose.calendarview.ui.ViewContainer
import org.threeten.bp.DayOfWeek
import org.threeten.bp.LocalDate
import org.threeten.bp.YearMonth
import org.threeten.bp.temporal.WeekFields

class CalendarFragment : Fragment() {
    private val TAG = "CalendarFragment"
    private var _binding: FragmentCalendarBinding? = null
    private val binding get() = _binding!!

    companion object;


    private lateinit var v: View
    private lateinit var medicationRequests: MutableList<MedicationRequest>
    private lateinit var scheduledAppointments: MutableList<Appointment>
    private val currentPatient = Patient("123", "Andy", "andykamin3@gmail.com", "")
    private val today = LocalDate.now()
    private var selectedDate: LocalDate? = today

    class DayViewContainer(val viewRoot: View) : ViewContainer(viewRoot) {
        lateinit var day: CalendarDay
        val binding = DayCalendarLayoutBinding.bind(viewRoot)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalendarBinding.inflate(inflater, container, false)
        v = binding.root
        return v
    }

    override fun onStart() {
        super.onStart()
        val currentMonth = YearMonth.now()
        val firstMonth = currentMonth.minusMonths(10)
        val lastMonth = currentMonth.plusMonths(10)
        val firstDayOfWeek = WeekFields.of(Config.default_locale).firstDayOfWeek
        val daysOfWeek = daysOfWeekFromLocale()
        binding.dateTextView.text = FormatUtils.selectionFormatter.format(today)
        binding.recyclerView.apply {
            adapter = CalendarAdapter(mutableListOf())
            layoutManager = LinearLayoutManager(requireContext())
        }

        binding.calendarView.apply {
            setup(firstMonth, lastMonth, firstDayOfWeek)
            scrollToMonth(currentMonth)
        }

        class MonthViewContainer(viewRoot: View) : ViewContainer(viewRoot) {
            val binding = MonthLegendCalendarLayoutBinding.bind(viewRoot)
            val linearLayout = binding.legendLayout
        }

        binding.calendarView.monthHeaderBinder =
            object : MonthHeaderFooterBinder<MonthViewContainer> {
                override fun bind(container: MonthViewContainer, month: CalendarMonth) {
                    if (container.linearLayout.tag == null) {
                        container.linearLayout.tag = month.yearMonth
                        container.linearLayout.children.map { it as TextView }
                            .forEachIndexed { index, tv ->
                                tv.text = daysOfWeek[index].name.first().toString()
                                tv.setTextColor(resources.getColor(R.color.colorBlack))
                            }
                    }
                }

                override fun create(view: View): MonthViewContainer =
                    MonthViewContainer(viewRoot = view)
            }

        binding.calendarView.dayBinder = object : DayBinder<DayViewContainer> {
            override fun create(view: View): DayViewContainer = DayViewContainer(view)

            @RequiresApi(Build.VERSION_CODES.O)
            override fun bind(container: DayViewContainer, day: CalendarDay) {
                container.day = day
                container.binding.dayEditText.text = day.day.toString()
                container.binding.root.setOnClickListener {
                    Log.d(TAG, container.day.date.dayOfWeek.toString())
                }
                if (container.day.owner == DayOwner.THIS_MONTH) {
                    when (container.day.date) {
                        selectedDate -> {
                            container.binding.dayEditText.background =
                                resources.getDrawable(R.drawable.example_3_today_bg)
                            container.binding.eventThatDay.visibility = View.GONE
                        }
                        else -> {
                            container.binding.dayEditText.background =
                                resources.getDrawable(R.drawable.bg_calendar_white)

                        }
                    }
                    val listOfDaysUsed = mutableListOf<DayOfWeek>()
                    for (medRequest in DummyData.medicationRequests) {
                        for (day in medRequest.scheduledFor) {
                            listOfDaysUsed.add(day.mapToABP())
                        }
                    }
                    if (listOfDaysUsed.contains(container.day.date.dayOfWeek)) {
                        container.binding.eventThatDay.visibility = View.VISIBLE
                    } else {
                        container.binding.eventThatDay.visibility = View.GONE
                    }
                    container.binding.root.setOnClickListener {
                        onDateSelected(container.day.date)
                    }
                } else {
                    container.binding.root.visibility = View.GONE
                }
            }
        }
        binding.calendarView.monthScrollListener = {
            binding.monthTitleTextView.text = if (it.year == today.year) {
                FormatUtils.titleSameYearFormatter.format(it.yearMonth)
            } else {
                FormatUtils.titleFormatter.format(it.yearMonth)
            }
            // Select the first day of the month when
            // we scroll to a new month.
            //selectDate(it.yearMonth.atDay(1))
        }
        updateUI()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        updateUI()
    }

    fun onDateSelected(newDate: LocalDate) {
        selectedDate = newDate
        binding.calendarView.notifyCalendarChanged()
        binding.dateTextView.text = FormatUtils.selectionFormatter.format(selectedDate)
        val newData = mutableListOf<PatientActions>()
        val mAdapter = (binding.recyclerView.adapter as CalendarAdapter)
        for (element in DummyData.scheduledAppointments) {
            val date = LocalDate.of(
                element.scheduledFor.mYear,
                mapToABPMonth(element.scheduledFor.mMonth),
                element.scheduledFor.mDay
            )
            Log.d(TAG, FormatUtils.selectionFormatter.format(date))
            if (date.equals(selectedDate)) {
                newData.add(element)
            }
        }
        for (element in DummyData.medicationRequests) {
            val weekDays = element.scheduledFor.map {
                it.mapToABP()
            }
            if (weekDays.contains(selectedDate!!.dayOfWeek)) {
                newData.add(element)
            }
        }
        mAdapter.setData(newData)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun updateUI() {
        val mActivity = requireActivity() as MainActivity
        mActivity.setFabDrawable(R.drawable.ic_baseline_home_24_b)
        mActivity.setFabColor(R.color.colorAccent)
        mActivity.setFabClickListener {
            val directions = CalendarFragmentDirections.actionCalendarFragmentToHomeTabbedScreen()
            v.findNavController().navigate(directions)
        }
    }
}


