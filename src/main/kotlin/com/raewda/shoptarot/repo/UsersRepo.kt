package com.raewda.shoptarot.repo

import com.raewda.shoptarot.models.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.text.SimpleDateFormat
import java.util.Date
import javax.xml.crypto.Data

interface UsersRepo: JpaRepository<Users, Long> {
    @Query("select month(registration) AS month, count(*) AS userscount from Users where year(registration) = ?1 group by month order by month", nativeQuery = true)
    fun usersregistrationst(
        year : String = SimpleDateFormat("yyyy").format(Date())
    ) : List<Map<Int, Int>>
}