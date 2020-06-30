package com.body.mytrain.entities.bd.person


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Person {
    @PrimaryKey
    lateinit var name: String
    var imgUrl: String? = null
}
