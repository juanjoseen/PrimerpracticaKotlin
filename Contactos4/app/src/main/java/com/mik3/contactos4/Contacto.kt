package com.mik3.contactos4

class Contacto(nombre: String, apellidos: String, empresa:String, edad: Int, peso:Float,direccion: String, telefono:String, email:String, foto: Int) {
    var nombre : String =""
    var apellidos: String = ""
    var empresa : String =""
    var edad : Int = 0
    var peso : Float=0f
    var direccion : String = ""
    var telefono : String = ""
    var email : String = ""
    var foto : Int = 0

    init {
        this.nombre=nombre
        this.apellidos=apellidos
        this.edad=edad
        this.empresa=empresa
        this.peso=peso
        this.direccion=direccion
        this.telefono=telefono
        this.email=email
        this.foto=foto
    }


}