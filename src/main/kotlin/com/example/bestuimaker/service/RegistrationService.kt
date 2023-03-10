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

    fun save() : String{
        repository.save(Registration("Bhagwati", "bhagwati.pandey@gmail.com"))
        repository.save(Registration("Kavita", "kavita.pandey@gmail.com"))
        repository.save(Registration("Kavita", "kavita.pandey@gmail.com"))

        val role = Role()
        role.name= ERole.ROLE_EMPLOYEE
        roleRepository.save(role);
        val role2 = Role()
        role2.name= ERole.ROLE_ADMIN
        roleRepository.save(role2);

        return "Saved data to database";
    }

    fun findAll () : Iterable<Registration>{
        return repository.findAll()
    };
}