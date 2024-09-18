package com.example.libreriasaludo

class Saludar (val nombre: String) {
    // metodo encargado de saludar a la propiedad
    fun saludo(idioma: Int):String {
        when  (idioma){
            1->  return "Buenos dias" + nombre
            2->  return "Hello" + nombre
            3->  return "Bonjour" + nombre
            4->  return "Namaste" + nombre
            5->  return "Salve" + nombre
        }
        return "Idioma no disponible"
    }
}