package com.example.bestuimaker.repository

import com.example.bestuimaker.model.Employee
import org.springframework.data.jpa.repository.JpaRepository

import java.util.*


interface EmployeeRepository : JpaRepository<Employee?, Long?> {
    fun findByEmployeename(employeename: String?): Optional<Employee?>?
    fun existsByEmployeename(employeename: String?): Boolean?
    fun existsByEmail(email: String?): Boolean?
}