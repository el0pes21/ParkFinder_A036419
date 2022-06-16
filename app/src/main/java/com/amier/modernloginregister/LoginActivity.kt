package com.amier.modernloginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.login.*

class LoginActivity : AppCompatActivity() {

    val ref=FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        btnRegLogin.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {

            val intent = Intent(this@LoginActivity, lista::class.java)
                    startActivity(intent)
        }

        var email=findViewById<TextInputEditText>(R.id.textemail)
        var password=findViewById<TextInputEditText>(R.id.password)




    }
}
