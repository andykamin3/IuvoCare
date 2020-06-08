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
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class ActionAdapter (private val patientActions: ArrayList<PatientActions>): RecyclerView.Adapter<ActionAdapter.ActionViewHolder>()  {
    class ActionViewHolder(val cardView: CardView) :RecyclerView.ViewHolder(cardView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActionViewHolder {
        val cardView = LayoutInflater.from(parent.context).inflate(R.layout.action_card, parent,false) as CardView
        return ActionViewHolder(cardView)
    }

    override fun getItemCount(): Int {
        return patientActions.size
    }

    override fun onBindViewHolder(holder: ActionViewHolder, position: Int) {
        if(patientActions[position].kind == ActionKind.APPOINTMENT){
            val element = patientActions[position] as Appointment
            holder.cardView.textViewMain.text = element.description
            holder.cardView.textViewTime.text = element.scheduledFor
            holder.cardView.textViewName.text = element.patient.name_given
            holder.cardView.TextViewStatus.text = element.status.toString()
        } else if(patientActions[position].kind == ActionKind.MEDICATION) {
            val element = patientActions[position] as MedicationRequest
            holder.cardView.textViewMain.text = element.medication
            holder.cardView.textViewTime.text = element.scheduledFor
            holder.cardView.textViewName.text = element.patient.name_given
            holder.cardView.TextViewStatus.text = element.status.toString()
        }
        holder.cardView.textViewKind.text = patientActions[position].kind.toString()

    }
}