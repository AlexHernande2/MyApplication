package com.example.myapplication

import android.os.Bundle
import android.widget.Button

import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.libreriasaludo.Saludar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //relacion con los elementos del layout
         var txtNombre: EditText = findViewById(R.id.txtNombre)
         var btnBoton : Button = findViewById(R.id.btnSaludar)
         var txtSaludar: TextView = findViewById(R.id.txtSaludar)

        btnBoton.setOnClickListener(){
            // click del boton para saludar
            var objSaludar = Saludar(txtNombre.text.toString()) /// instancia de saludar
            txtSaludar.text = objSaludar.saludo(2)
        }
    }
}