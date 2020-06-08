package com.andreskaminker.iuvocare.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.andreskaminker.iuvocare.R

//
class LogInFragment : Fragment() {
    //TODO: Add login functionality and ToS, etc.
    private lateinit var v: View
    private lateinit var logInButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_log_in, container, false)
        logInButton = v.findViewById(R.id.logInButton)
        return v
    }

    override fun onStart() {
        super.onStart()
        logInButton.setOnClickListener{
            val directions = AuthFragmentDirections.actionAuthFragmentToFragmentHome()
            parentFragment?.findNavController()?.navigate(directions)
        }
    }

}