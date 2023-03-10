package com.example.bestuimaker.service

import com.example.bestuimaker.model.ERole
import com.example.bestuimaker.model.Registration
import com.example.bestuimaker.model.Role
import com.example.bestuimaker.repository.RegistrationRepository
import com.example.bestuimaker.repository.RoleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RegistrationService {
    @Autowired
    lateinit var repository : RegistrationRepository

    @Autowired
    lateinit var roleRepository: RoleRepository


    fun saveRoles() : String {
        // Sample roles
        val role = Role()
        role.name= ERole.ROLE_EMPLOYEE
        roleRepository.save(role);
        val role2 = Role()
        role2.name= ERole.ROLE_ADMIN
        roleRepository.save(role2);

        // You can add as many as roles here


        return "Saved sample roles to database"
    }

    // Lets Save some sample users to database
    fun saveRegistrations() : String{
        // These users are the sample data to show how to save records through JPA in database
        repository.save(Registration("Tom", "tom@gmail.com"))
        repository.save(Registration("Dick", "dick@gmail.com"))
        repository.save(Registration("Harry", "harry@gmail.com"))

        return "Saved sample data to database"
    }

    // Lets get all the sample user from database
    fun findAllRegistrations () : Iterable<Registration>{
        return repository.findAll()
    };
}