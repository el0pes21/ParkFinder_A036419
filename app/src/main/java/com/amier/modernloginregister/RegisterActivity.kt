package com.amier.modernloginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.register.*


class RegisterActivity : AppCompatActivity() {

    val ref= FirebaseAuth.getInstance()
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        btnLogRegister.setOnClickListener {
            onBackPressed()
        }
        val button: Button = findViewById(R.id.buttonr)
        button.setOnClickListener {
            onBackPressed()

        }
        var email=findViewById<TextInputEditText>(R.id.textemail2)
        var password=findViewById<TextInputEditText>(R.id.password2)



        /*auth = Firebase.auth

        buttonr.setOnClickListener {
            ref.CreateUserWithEmailAndPassword(
                auth,
                email.text.toString().trim(),
                password.text.toString().trim()
            )
        }*/
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
    }




}
