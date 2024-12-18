package com.raewda.shoptarot.repo

import com.raewda.shoptarot.models.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepo: JpaRepository<Users, Long> {
}