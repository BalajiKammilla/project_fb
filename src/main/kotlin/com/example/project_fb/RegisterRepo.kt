package com.example.project_fb

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository

@Repository
interface RegisterRepo:JpaRepository<Register,Int> {
    fun findByEmailAndPassword(email:String,password:String):Register?
}

interface LoginRepo:JpaRepository<Login,Int>