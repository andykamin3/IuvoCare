package com.andreskaminker.iuvocare.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.MainActivity
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.MedicationRequest
import com.andreskaminker.iuvocare.helpers.DummyData
import com.andreskaminker.iuvocare.helpers.MedicationAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SeeMedicationFragment : Fragment() {
    private lateinit var v: View
    private lateinit var medicationAdapter: MedicationAdapter
    private lateinit var medicationList: MutableList<MedicationRequest>
    private lateinit var recyclerView: RecyclerView
    private lateinit var fabButton: FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_see_medication, container, false)
        recyclerView = v.findViewById(R.id.recyclerMedications)
        fabButton = requireActivity().findViewById(R.id.floatingActionButton)
        return v
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            SeeMedicationFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    override fun onStart() {
        super.onStart()
        updateUI()
        medicationList = DummyData.medicationRequests
        medicationAdapter = MedicationAdapter(medicationList, this)
        recyclerView.apply {
            setHasFixedSize(true)
            adapter = medicationAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        updateUI()
    }

    override fun onResume() {
        super.onResume()
        updateUI()
    }

    private fun updateUI() {
        val mActivity = requireActivity() as MainActivity
        mActivity.setFabDrawable(R.drawable.ic_baseline_add_24_b)
        //mActivity.setFabColor(R.color.colorAccent)
        mActivity.setFabClickListener {
            val directions =
                HomeTabbedScreenDirections.actionHomeTabbedScreenToAddMedicationFragment()
            v.findNavController().navigate(directions)
        }
    }

}