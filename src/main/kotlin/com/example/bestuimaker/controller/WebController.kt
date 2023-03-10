package com.example.bestuimaker.controller

import com.example.bestuimaker.service.RegistrationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController (val registrationService: RegistrationService){

    @GetMapping("/save")
    fun save () = registrationService.save();

    @GetMapping("/all")
    fun findAll () = registrationService.findAll();

}