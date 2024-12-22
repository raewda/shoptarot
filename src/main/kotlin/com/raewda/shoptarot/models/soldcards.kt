package com.raewda.shoptarot.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
data class soldcards(
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id : Int? = null,
    val card : Int = 0,
    val client : Int = 0,
    val purchase : Date = Date()
)
