package com.raewda.shoptarot.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Users(
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id: Int? = null,
    val login: String = "",
    val password : String = ""
)
