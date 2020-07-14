package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.andreskaminker.iuvocare.databinding.FragmentSeeAppointmentBinding
import com.andreskaminker.iuvocare.helpers.AppointmentAdapter
import com.andreskaminker.iuvocare.helpers.DummyData

class SeeAppointmentFragment : Fragment() {

    var _binding: FragmentSeeAppointmentBinding? = null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSeeAppointmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerAppointments.apply {
            adapter = AppointmentAdapter(DummyData.scheduledAppointments)
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            SeeAppointmentFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}