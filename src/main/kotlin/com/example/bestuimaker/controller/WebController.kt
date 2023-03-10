package com.example.bestuimaker.controller

import com.example.bestuimaker.service.RegistrationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController(val registrationService: RegistrationService) {

    // Lets same some Roles and sample data to database
    // So that we can Signup and Sign-in to any particular Role
    @GetMapping("/")
    fun defaultPage() : String {
     return  "Welcome to Spring-boot, Kotlin, JWT, Postgres starter kit by BestUIMaker"
    }

    @GetMapping("/save-roles")
    fun saveRoles() = registrationService.saveRoles();

    @GetMapping("/save")
    fun save() = registrationService.saveRegistrations();

    @GetMapping("/all")
    fun findAll() = registrationService.findAllRegistrations();

}