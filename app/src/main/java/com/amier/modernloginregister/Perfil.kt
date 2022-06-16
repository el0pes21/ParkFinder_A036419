package com.amier.modernloginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val button: Button = findViewById(R.id.buttonP)
        button.setOnClickListener {
            val intent = Intent(this@Perfil, lista::class.java)
            startActivity(intent)

        }
        val button2: Button = findViewById(R.id.button4)
        button2.setOnClickListener {
            val intent = Intent(this@Perfil, mapa2::class.java)
            startActivity(intent)

        }

    }

}