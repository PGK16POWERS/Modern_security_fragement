package com.example.modernsecurity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class Login : Fragment() {

    private lateinit var emailInputField : EditText
    private lateinit var passwordInputField : EditText
    private lateinit var loginButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        // ACCESS ALL THE INPUT FIELDS + LOGIN BUTTON
        emailInputField = view.findViewById(R.id.email_input)
        passwordInputField = view.findViewById(R.id.password_input)
        loginButton = view.findViewById(R.id.login_button)

        val redirectToCreateAcc = view.findViewById<TextView>(R.id.redirect_to_create_acc)
        val forgotPassword = view.findViewById<TextView>(R.id.forgot_password)

        forgotPassword.setOnClickListener { view ->
            findNavController().navigate(R.id.resetPassword)
        }

        redirectToCreateAcc.setOnClickListener { view ->
            findNavController().navigate(R.id.createAccount)
        }

        return view
    }

    private fun checkInputFields() {
        if (emailInputField.text.length < 1) {
            loginButton.setBackgroundResource(R.drawable.disabled_button)
        }
    }


}