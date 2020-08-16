package com.andreskaminker.iuvohelp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.andreskaminker.iuvohelp.MainActivity
import com.andreskaminker.iuvohelp.R
import com.andreskaminker.iuvohelp.StartActivity
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment : Fragment() {
    private lateinit var v: View
    private lateinit var buttonLogOut: Button
    private lateinit var buttonChangePwd: Button
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_profile, container, false)
        buttonLogOut = v.findViewById(R.id.logOutButton)
        buttonChangePwd = v.findViewById(R.id.changePwdButton)
        return v
    }

    private fun updateUI() {
        val mActivity = requireActivity() as MainActivity
        mActivity.setFabDrawable(R.drawable.ic_baseline_home_24_b)
        mActivity.setFabColor(R.color.colorAccent)
        mActivity.setFabClickListener {
            val directions = ProfileFragmentDirections.actionProfileFragmentToHomeTabbedScreen()
            v.findNavController().navigate(directions)
        }
    }

    override fun onStart() {
        //updateUI()
        auth = FirebaseAuth.getInstance()
        buttonLogOut.setOnClickListener {
            auth.signOut()
            Snackbar.make(v, "Logged out", Snackbar.LENGTH_SHORT)
            val intent = Intent(requireActivity(), StartActivity::class.java)
            startActivity(intent)
        }

        super.onStart()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        updateUI()
    }
}
