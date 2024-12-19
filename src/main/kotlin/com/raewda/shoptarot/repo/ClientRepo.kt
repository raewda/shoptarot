package com.raewda.shoptarot.repo

import com.raewda.shoptarot.models.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepo: JpaRepository<Client, Long> {
}