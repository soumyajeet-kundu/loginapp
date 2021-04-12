package com.example.androidapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPref = getSharedPreferences("signUp", Context.MODE_PRIVATE)
        button.setOnClickListener {

            var un = editTextTextPersonName.text.toString()
            var pass = editTextTextPassword.text.toString()

            var email = sharedPref.getString("email", null)
            var password = sharedPref.getString("pass", null)

           if(un==email  && pass == password)
            {
                Toast.makeText(this, "Welcome $un", Toast.LENGTH_LONG).show()
                var intentHere = Intent(this,MainActivity2::class.java)
                startActivity(intentHere)
            }
            else
            {
                Toast.makeText(this, "Either Username or Password is Wrong", Toast.LENGTH_LONG).show()
            }

        }
        bt_sign_up.setOnClickListener{
            var signUpIntent = Intent(this, SignUp::class.java)
            startActivity(signUpIntent)
        }

        forgot_password.setOnClickListener {
            var forgotIntent = Intent(this, ForgotPass::class.java)
            startActivity(forgotIntent)
        }
    }
}