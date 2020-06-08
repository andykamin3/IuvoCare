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
import com.andreskaminker.iuvocare.fragments.SignUpFragmentDirections.actionSignUpFragmentToFragmentHome

class SignUpFragment : Fragment() {
    private lateinit var v: View
    private lateinit var buttonSignUp: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_sign_up, container, false)
        buttonSignUp = v.findViewById(R.id.logInButton)
        return v
    }

    override fun onStart() {
        super.onStart()
        buttonSignUp.setOnClickListener{
            val directions = AuthFragmentDirections.actionAuthFragmentToFragmentHome()
            parentFragment?.findNavController()?.navigate(directions)
        }
    }
}