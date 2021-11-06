package com.ort.usanote.entities

import com.google.firebase.Timestamp
import com.google.firebase.firestore.ServerTimestamp
import java.util.*

class Product (
    idProducto:String,
    nombre : String,
    description: String,
    price : Double,
    stock: Int,
    categoria:String,
    marca:String,
    imageUrl : String,
) {
    lateinit var idProducto:String
    lateinit var nombre : String
    lateinit var description: String
    var price : Double = 0.0
    var stock: Int = 0
    lateinit var categoria:String
    lateinit var marca:String
    lateinit var imageUrl : String
    @ServerTimestamp
    var created_at: Date? = null
    constructor():this("","","",0.0,0,"","","")
    init {
        this.idProducto = idProducto!!
        this.nombre = nombre!!
        this.description = description!!
        this.price = price!!
        this.stock = stock!!
        this.categoria = categoria!!
        this.marca = marca!!
        this.imageUrl = imageUrl!!
    }
}