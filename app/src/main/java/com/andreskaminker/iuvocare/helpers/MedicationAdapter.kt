package com.andreskaminker.iuvocare.helpers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.MedicationRequest

class MedicationAdapter(private val medicationList: MutableList<MedicationRequest>) :
    RecyclerView.Adapter<MedicationAdapter.MedicationHolder>() {
    class MedicationHolder(cardView: CardView) : RecyclerView.ViewHolder(cardView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicationHolder {
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_medication, parent, false)
        return MedicationHolder(cardView as CardView)
    }

    override fun getItemCount(): Int {
        return medicationList.size
    }

    override fun onBindViewHolder(holder: MedicationHolder, position: Int) {

    }


}