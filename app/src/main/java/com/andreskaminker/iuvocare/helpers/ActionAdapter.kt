package com.andreskaminker.iuvocare.helpers

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.andreskaminker.iuvocare.R
import com.andreskaminker.iuvocare.dtypes.ActionKind
import com.andreskaminker.iuvocare.dtypes.Appointment
import com.andreskaminker.iuvocare.dtypes.MedicationRequest
import com.andreskaminker.iuvocare.dtypes.PatientActions
import kotlinx.android.synthetic.main.action_card.view.*

class ActionAdapter (private val patientActions: ArrayList<PatientActions>): RecyclerView.Adapter<ActionAdapter.ActionViewHolder>()  {
    class ActionViewHolder(val cardView: CardView) : RecyclerView.ViewHolder(cardView) {
        val cv = cardView
        val textViewMain: TextView = cv.findViewById(R.id.textViewMain)
        val textViewName: TextView = cv.findViewById(R.id.textViewName)
        val textViewKind: TextView = cv.findViewById(R.id.textViewMain)
        val textViewStatus: TextView = cv.findViewById(R.id.textViewStatus)
        val textViewTime: TextView = cv.findViewById(R.id.textViewTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActionViewHolder {
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.action_card, parent, false) as CardView
        return ActionViewHolder(cardView)
    }

    override fun getItemCount(): Int {
        return patientActions.size
    }

    override fun onBindViewHolder(holder: ActionViewHolder, position: Int) {
        if(patientActions[position].kind == ActionKind.APPOINTMENT) {
            val element = patientActions[position] as Appointment
            holder.textViewMain.text = element.description
            holder.textViewTime.text = element.scheduledFor
            holder.textViewTime.text = element.patient.name_given
            holder.textViewStatus.text = element.status.toString()
        } else if(patientActions[position].kind == ActionKind.MEDICATION) {
            val element = patientActions[position] as MedicationRequest
            holder.textViewMain.text = element.medication
            holder.textViewTime.text = element.scheduledFor
            holder.textViewTime.text = element.patient.name_given
            holder.textViewStatus.text = element.status.toString()
            holder.cardView.textViewStatus.text = element.status.toString()
        }
        holder.cardView.textViewKind.text = patientActions[position].kind.toString()

    }
}