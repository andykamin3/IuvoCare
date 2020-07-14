package com.andreskaminker.iuvocare.helpers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.databinding.CardAppointmentBinding
import com.andreskaminker.iuvocare.dtypes.Appointment
import com.andreskaminker.iuvocare.modules.FormatUtils
import com.andreskaminker.iuvocare.modules.mapToABPMonth
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalTime

class AppointmentAdapter(val appointmentList: MutableList<Appointment>) :
    RecyclerView.Adapter<AppointmentAdapter.AppointmentHolder>() {
    class AppointmentHolder(val binding: CardAppointmentBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppointmentHolder {
        val binding =
            CardAppointmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AppointmentHolder(binding)
    }

    override fun getItemCount(): Int = appointmentList.size


    override fun onBindViewHolder(holder: AppointmentHolder, position: Int) {
        holder.binding.appointmentDescriptionCard.text = appointmentList[position].description
        holder.binding.appointmentTitleCard.text = appointmentList[position].title
        holder.binding.appointmentDateCard.text = formatStringDate(position)
        holder.binding.appointmentTimeCard.text = formatTime(position)

    }

    private fun formatStringDate(position: Int): String {
        appointmentList[position].scheduledFor.run {
            val localDate = LocalDate.of(mYear, mapToABPMonth(mMonth), mDay)
            return localDate.format(FormatUtils.selectionFormatter)
        }
    }

    private fun formatTime(position: Int): String {
        appointmentList[position].scheduledFor.run {
            val localTime = LocalTime.of(mHour, mMinutes)
            return localTime.format(FormatUtils.timeFormatter)
        }
    }
}