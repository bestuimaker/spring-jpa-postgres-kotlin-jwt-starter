package com.example.bestuimaker.model

import jakarta.persistence.*

import java.util.HashSet
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Email
import javax.validation.constraints.Size


@Entity
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = -1

    var employeename: @NotBlank @Size(max = 20) String? = null
    var email: @NotBlank @Size(max = 50) @Email String? = null
    var password: @NotBlank @Size(max = 120) String? = null

    @ManyToMany(fetch = FetchType.EAGER)
    var roles: Set<Role> = HashSet()

    constructor() {}
    constructor(employeename: String?, email: String?, password: String?) : super() {
        this.employeename = employeename
        this.email = email
        this.password = password
    }
}