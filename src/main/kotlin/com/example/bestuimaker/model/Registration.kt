package com.example.bestuimaker.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Registration (
    val name : String,
    val email : String,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long= -1){
    constructor() : this("","")
}