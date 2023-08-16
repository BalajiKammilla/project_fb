package com.example.project_fb

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/register")
class Controller(private val service: service) {


//    @PostMapping("/post")
//    fun registerForm(@RequestParam("username")username:String,@RequestParam("email")email:String,
//                     @RequestParam("mobilenumber")mobilenumber:String,@RequestParam("password")password:String):Register{
//        val form=Register(username = username, email = email, mobilenumber = mobilenumber, password = password)
//
//        return form
//    }

    @PostMapping("/ac")
    fun save(@ModelAttribute register: Register): ResponseEntity<Register> {
        val registeredAccount = service.register(register)
        return if (registeredAccount != null) {
            ResponseEntity.ok(registeredAccount)
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
        }
    }


//    @PostMapping("/logs")
//    fun loginForm(@RequestBody login: Login): Register? {
//        val user=service.login(login.email,login.password)
//         if (user !=null) {
//              loginRepo.save(login)
//        }
//        return user
//
//    }

    @PostMapping("/logs")
    fun logs(@ModelAttribute login: Login): ResponseEntity<Register> {
        val user = service.login(login.email, login.password)

        return if (user != null) {
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
        }
    }


}