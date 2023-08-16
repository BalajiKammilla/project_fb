package com.example.project_fb

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Register(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int?=null,
    val username:String,
    val email:String,
    val mobilenumber:String,
    val password:String
)

@Entity
data class Login(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int?=null,
    val email:String,
    val password:String
)
