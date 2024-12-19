package com.raewda.shoptarot.repo

import com.raewda.shoptarot.models.Reviews
import org.springframework.data.jpa.repository.JpaRepository

interface ReviewsRepo: JpaRepository<Reviews, Long> {
}