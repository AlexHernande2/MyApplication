package com.example.libreriacalculadora

class Calculadora (val num1: Int, val num2: Int) {
    fun suma(): Int{
        return num1 + num2
    }
    fun resta(): Int{
        return num1 - num2
    }
    fun multiplicar (): Int{
        return num1 * num2
    }
    fun division (): Int{
        if (num2==0){
            throw IllegalArgumentException("No se puede dividir por cero")
        }
        return num1 / num2
    }
}