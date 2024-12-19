package com.raewda.shoptarot.controllers

import com.raewda.shoptarot.repo.CardRepo
import com.raewda.shoptarot.repo.ClientRepo
import com.raewda.shoptarot.repo.SoldcardsRepo
import com.raewda.shoptarot.repo.UsersRepo
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController(
    private val usersRepo: UsersRepo,
    private val cardRepo: CardRepo,
    private val clientRepo: ClientRepo,
    private val soldcardsRepo: SoldcardsRepo
) {
    @GetMapping(value = ["/" , "/index"])
    fun home (): String{
        return "index"
    }
    @GetMapping("/me")
    fun me (): String{
        return "me"
    }
    @GetMapping("/reviews")
    fun reviews (): String{
        return "reviews"
    }
    @GetMapping("/catalog")
    fun catalog (): String{
        return "catalog"
    }
    @GetMapping("/cart")
    fun cart (): String{
        return "cart"
    }
    @GetMapping("/basket")
    fun basket (): String{
        return "basket"
    }
    @GetMapping("/adminpage")
    fun adminpage (model: Model): String{
        val users = usersRepo.findAll()
        model.addAttribute("users", users)
        val card = cardRepo.findAll()
        model.addAttribute("card", card)
        val client = clientRepo.findAll()
        model.addAttribute("client", client)
        val soldcards = soldcardsRepo.findAll()
        model.addAttribute("soldcards", soldcards)
        return "adminpage"
    }
}
