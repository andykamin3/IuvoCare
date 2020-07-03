package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.andreskaminker.iuvocare.R

class ProfileFragment : Fragment() {
    private lateinit var v: View
    private lateinit var buttonLogOut: Button
    private lateinit var buttonChangePwd: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_profile, container, false)
        buttonLogOut = v.findViewById(R.id.logOutButton)
        buttonChangePwd = v.findViewById(R.id.changePwdButton)
        return v
    }
}
