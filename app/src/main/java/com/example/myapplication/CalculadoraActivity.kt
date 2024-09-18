package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.libreriacalculadora.Calculadora
import com.example.libreriasaludo.Saludar

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculadora)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//relacion con los elementos del layout

        var txtNumero1 : EditText = findViewById(R.id.txtNumero1)
        var txtNumero2 : EditText = findViewById(R.id.txtNumero2)
        var txtResultado : TextView = findViewById(R.id.txtResultado)
        var btnBotonSuma : Button = findViewById(R.id.btnSuma)
        var btnBotonResta : Button = findViewById(R.id.btnResta)
        var btnBotonMultiplicar : Button = findViewById(R.id.btnMultiplicar)
        var btnBotonDivision : Button = findViewById(R.id.btnDivision)

        // Configurar la acción para el botón de suma
        btnBotonSuma.setOnClickListener {
            val numero1 = txtNumero1.text.toString().toIntOrNull()
            val numero2 = txtNumero2.text.toString().toIntOrNull()

            if (numero1 != null && numero2 != null) {
                val calculadora = Calculadora(numero1, numero2)
                txtResultado.text = "Resultado: ${calculadora.suma()}"
            } else {
                txtResultado.text = "Por favor ingresa números válidos"
            }
        }
        // Configurar la acción para el botón de resta
        btnBotonResta.setOnClickListener {
            val numero1 = txtNumero1.text.toString().toIntOrNull()
            val numero2 = txtNumero2.text.toString().toIntOrNull()

            if (numero1 != null && numero2 != null) {
                val calculadora = Calculadora(numero1, numero2)
                txtResultado.text = "Resultado: ${calculadora.resta()}"
            } else {
                txtResultado.text = "Por favor ingresa números válidos"
            }
        }

        // Configurar la acción para el botón de multiplicar
        btnBotonMultiplicar.setOnClickListener {
            val numero1 = txtNumero1.text.toString().toIntOrNull()
            val numero2 = txtNumero2.text.toString().toIntOrNull()

            if (numero1 != null && numero2 != null) {
                val calculadora = Calculadora(numero1, numero2)
                txtResultado.text = "Resultado: ${calculadora.multiplicar()}"
            } else {
                txtResultado.text = "Por favor ingresa números válidos"
            }
        }

        // Configurar la acción para el botón de dividir
        btnBotonDivision.setOnClickListener {
            val numero1 = txtNumero1.text.toString().toIntOrNull()
            val numero2 = txtNumero2.text.toString().toIntOrNull()

            if (numero1 != null && numero2 != null) {
                try {
                    val calculadora = Calculadora(numero1, numero2)
                    txtResultado.text = "Resultado: ${calculadora.division()}"
                } catch (e: IllegalArgumentException) {
                    txtResultado.text = e.message
                }
            } else {
                txtResultado.text = "Por favor ingresa números válidos"
            }
}
    }
}