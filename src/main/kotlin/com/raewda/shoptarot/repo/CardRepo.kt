package com.raewda.shoptarot.repo

import com.raewda.shoptarot.models.Card
import org.springframework.data.jpa.repository.JpaRepository

interface CardRepo: JpaRepository<Card, Long> {
}