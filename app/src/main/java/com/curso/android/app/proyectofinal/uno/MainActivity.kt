package com.curso.android.app.proyectofinal.uno

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // ...

    fun compareTexts(text1: String, text2: String): String {
        return if (text1 == text2) {
            "Los textos son iguales."
        } else {
            "Los textos son diferentes."
        }
    }
}

