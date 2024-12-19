package com.raewda.shoptarot.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Card(
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id : Int? = null,
    val name : String = "",
    val description : String = "",
    val image : String = "",
    val price : Int = 0
)

