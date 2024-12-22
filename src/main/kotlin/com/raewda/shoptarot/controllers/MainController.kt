package com.raewda.shoptarot.controllers

import com.raewda.shoptarot.repo.*
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController(
    private val usersRepo: UsersRepo,
    private val cardRepo: CardRepo,
    private val clientRepo: ClientRepo,
    private val soldcardsRepo: SoldcardsRepo,
    private val reviewsRepo: ReviewsRepo
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
    fun catalog (model: Model): String{
        val card = cardRepo.findAll()
        model.addAttribute("card", card)
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
    @GetMapping("/conditions")
    fun conditions (): String{
        return "conditions"
    }
    @GetMapping("/features")
    fun features (): String{
        return "features"
    }
    @GetMapping("/adminpage")
    fun adminpage (model: Model): String{
        val userscount = usersRepo.usersregistrationst()
        model.addAttribute("userscount", userscount)
        val users = usersRepo.findAll()
        model.addAttribute("users", users)
        val card = cardRepo.findAll()
        model.addAttribute("card", card)
        val client = clientRepo.findAll()
        model.addAttribute("client", client)
        val pcount = soldcardsRepo.purchasest()
        model.addAttribute("pcount", pcount)
        val soldcards = soldcardsRepo.findAll()
        model.addAttribute("soldcards", soldcards)
        val reviews = reviewsRepo.findAll()
        model.addAttribute("reviews", reviews)
        return "adminpage"
    }
}
