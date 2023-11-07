package com.example.apilocalapp

class Publicaciones {
    private var id = 0
    private var nombre: String? = null
    private var descripcion: String? = null

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getNombre(): String? {
        return nombre
    }

    fun setNombre(nombre: String?) {
        this.nombre = nombre
    }

    fun getDescripcion(): String? {
        return descripcion
    }

    fun setDescripcion(descripcion: String?) {
        this.descripcion = descripcion
    }

}
