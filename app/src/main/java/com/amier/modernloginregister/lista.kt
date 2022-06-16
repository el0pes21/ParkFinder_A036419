package com.amier.modernloginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_lista.*

class lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.concelhos, android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        val button: Button = findViewById(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(this@lista, Perfil::class.java)
            startActivity(intent)
        }

        fun getValues(view: View) {
            Toast.makeText(
                this, "Spinner 1 " + spinner.selectedItem.toString() +
                        "\nSpinner 2 " + spinner.selectedItem.toString(), Toast.LENGTH_LONG
            ).show()
        }

    }
}

