package com.andreskaminker.iuvocare.helpers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.MedicationRequest

class MedicationAdapter(private val medicationList: MutableList<MedicationRequest>) :
    RecyclerView.Adapter<MedicationAdapter.MedicationHolder>() {
    class MedicationHolder(cv: View) : RecyclerView.ViewHolder(cv) {
        val textViewMedicationName: TextView = cv.findViewById(R.id.textViewMedicationName)
        val textViewWeekdays: TextView = cv.findViewById(R.id.textViewMedicationDate)
        val imageView: ImageView = cv.findViewById(R.id.imageViewMedication)
        val textViewTime: TextView = cv.findViewById(R.id.textViewMedicationTime)
        val cardView = cv.findViewById<CardView>(R.id.cardViewMedication)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicationHolder {
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_medication, parent, false)
        return MedicationHolder(cardView)
    }

    override fun getItemCount(): Int {
        return medicationList.size
    }

    override fun onBindViewHolder(holder: MedicationHolder, position: Int) {

        holder.apply {
            textViewTime.text =
                "${medicationList[position].takeTime.hour}:${medicationList[position].takeTime.minutes}"
            textViewMedicationName.text = medicationList[position].medication
            textViewWeekdays.text = medicationList[position].scheduledFor.toString()
            //TODO: add image view support with Glide

        }
    }


}