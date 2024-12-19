package com.raewda.shoptarot.repo


import com.raewda.shoptarot.models.soldcards
import org.springframework.data.jpa.repository.JpaRepository

interface SoldcardsRepo: JpaRepository<soldcards, Long> {
}