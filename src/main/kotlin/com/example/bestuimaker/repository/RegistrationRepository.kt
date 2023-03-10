package com.example.bestuimaker.repository

import com.example.bestuimaker.model.Registration
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface  RegistrationRepository : JpaRepository<Registration, Long>{
    fun findByName(name:String) : Iterable<Registration>
}