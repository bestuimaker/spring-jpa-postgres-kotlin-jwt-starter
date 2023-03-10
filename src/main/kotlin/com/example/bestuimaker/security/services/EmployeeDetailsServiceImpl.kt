package com.example.bestuimaker.security.services

import com.example.bestuimaker.model.Employee
import com.example.bestuimaker.model.Registration
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import kotlin.Throws
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service
import com.example.bestuimaker.repository.EmployeeRepository

@Service
class EmployeeDetailsServiceImpl : UserDetailsService {

    @Autowired
    var employeeRepository: EmployeeRepository? = null


    override fun loadUserByUsername(employeename: String): UserDetails {
        val employee: Employee = employeeRepository!!.findByEmployeename(employeename)
            ?.orElseThrow { UsernameNotFoundException("Employee Not Found with username: " +
                    "$employeename") }!!
        return EmployeeDetailsImpl.build(employee)
    }


    /*
    @Transactional
    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(employeename: String): UserDetails {
        val employee: Employee = employeeRepository!!.findByEmployeename(employeename)
            ?.orElseThrow { UsernameNotFoundException("Employee Not Found with username: " +
                    "$employeename") }!!
        return EmployeeDetailsImpl.build(employee)
    }*/
}