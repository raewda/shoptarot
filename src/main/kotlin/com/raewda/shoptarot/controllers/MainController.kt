package com.raewda.shoptarot.controllers

import com.raewda.shoptarot.repo.UsersRepo
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController(
    private val usersRepo: UsersRepo
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
    @GetMapping("/game2")
    fun game2 (): String{
        return "game2"
    }
    @GetMapping("/game")
    fun game (): String{
        return "game"
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
        return "adminpage"
    }
}
