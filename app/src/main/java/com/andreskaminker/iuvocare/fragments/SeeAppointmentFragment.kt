package com.andreskaminker.iuvocare.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.andreskaminker.iuvocare.MainActivity
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.databinding.FragmentSeeAppointmentBinding
import com.andreskaminker.iuvocare.helpers.AppointmentAdapter
import com.andreskaminker.iuvocare.helpers.DummyData
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SeeAppointmentFragment : Fragment() {

    var _binding: FragmentSeeAppointmentBinding? = null
    val binding get() = _binding!!
    private lateinit var fabButton: FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSeeAppointmentBinding.inflate(inflater, container, false)
        fabButton = requireActivity().findViewById(R.id.floatingActionButton)
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

    override fun onAttach(context: Context) {
        super.onAttach(context)
        updateUI()
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            SeeAppointmentFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    private fun updateUI() {
        val mActivity = requireActivity() as MainActivity
        mActivity.setFabDrawable(R.drawable.ic_baseline_add_24_b)
        mActivity.setFabClickListener {
            val directions =
                HomeTabbedScreenDirections.actionHomeTabbedScreenToAddAppointmentFragment()
            binding.root.findNavController().navigate(directions)
        }
    }
}