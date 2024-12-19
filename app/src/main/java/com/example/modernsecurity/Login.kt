package com.example.modernsecurity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val redirectLink = view.findViewById<TextView>(R.id.redirect_link)
        val forgotPassword = view.findViewById<TextView>(R.id.forgot_password)

        redirectLink.setOnClickListener{ view ->
            findNavController().navigate(R.id.createAccount)
        }

        forgotPassword.setOnClickListener { view ->
            findNavController().navigate(R.id.resetPassword)
        }
        return view
    }

}