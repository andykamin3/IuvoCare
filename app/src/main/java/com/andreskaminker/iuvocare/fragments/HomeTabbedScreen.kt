package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.navigation.findNavController
import androidx.viewpager.widget.ViewPager
import com.andreskaminker.iuvocare.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout

class HomeTabbedScreen : Fragment() {

    private lateinit var v: View
    private lateinit var homeScreenAdapter: ScreenPageAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    private lateinit var appBar: View
    lateinit var fab: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home_tabbed_screen, container, false)

        appBar = this.requireActivity().findViewById(R.id.coordinatorLayout)
        fab = appBar.findViewById(R.id.fab)

        return v
    }

    override fun onStart() {
        super.onStart()
        fab.setOnClickListener {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager = v.findViewById(R.id.home_pager)
        tabLayout = v.findViewById(R.id.home_layout)
        homeScreenAdapter = ScreenPageAdapter(childFragmentManager)
        viewPager.adapter = homeScreenAdapter
    }

    inner class ScreenPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            fab.apply {
                if (position == 0) {
                    setImageDrawable(resources.getDrawable(R.drawable.ic_pill_w))
                    setOnClickListener {
                        val directions =
                            HomeTabbedScreenDirections.actionHomeTabbedScreenToAddMedicationFragment()
                        v.findNavController().navigate(directions)
                    }

                } else {
                    setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_post_add_24_w))
                    setOnClickListener {
                        val directions =
                            HomeTabbedScreenDirections.actionHomeTabbedScreenToAddAppointmentFragment()
                        v.findNavController().navigate(directions)
                    }
                }
            }

            return if (position == 0) {
                SeeMedicationFragment()
            } else {
                SeeAppointmentFragment()
            }
        }

        override fun getCount(): Int = 2
        override fun getPageTitle(position: Int): CharSequence? {
            return if (position == 0) {
                "Medicaciones"
            } else {
                "Turnos Médicos"
            }
        }
    }
}