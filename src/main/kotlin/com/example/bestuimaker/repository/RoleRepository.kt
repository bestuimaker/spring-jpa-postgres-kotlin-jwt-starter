package com.example.bestuimaker.repository

import com.example.bestuimaker.model.ERole
import com.example.bestuimaker.model.Role
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RoleRepository : JpaRepository<Role?, Long?> {
    fun findByName(name: ERole?): Optional<Role?>?
}