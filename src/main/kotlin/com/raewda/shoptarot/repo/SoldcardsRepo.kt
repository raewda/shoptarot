package com.raewda.shoptarot.repo


import com.raewda.shoptarot.models.soldcards
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.text.SimpleDateFormat
import java.util.*

interface SoldcardsRepo: JpaRepository<soldcards, Long> {
    @Query("select month(purchase) AS month, count(*) AS pcount from soldcards where year(purchase) = ?1 group by month order by month", nativeQuery = true)
    fun purchasest(
        year : String = SimpleDateFormat("yyyy").format(Date())
    ) : List<Map<Int, Int>>
}