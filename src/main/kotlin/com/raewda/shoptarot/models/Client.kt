package com.raewda.shoptarot.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Client(
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id: Int? = null,
    val username : String= "",
    val email : String = "",
    val payments : String = "",
    val address : String = ""
)



