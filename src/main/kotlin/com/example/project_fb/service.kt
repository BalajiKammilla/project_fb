package com.example.project_fb

import org.apache.juli.logging.Log
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestParam
import java.lang.RuntimeException

@Service
class service(private val registerRepo: RegisterRepo,private val loginRepo: LoginRepo) {


    fun register(register: Register):Register?
    {
      return  registerRepo.save(register)
    }


    fun login(email: String, password: String): Register? {
        val user = registerRepo.findByEmailAndPassword(email,password)

        if (user != null) {
            loginRepo.save(Login(email = email, password = password))
        }
        return user
    }

}