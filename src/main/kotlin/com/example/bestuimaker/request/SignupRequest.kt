package com.example.bestuimaker.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

class SignupRequest {
    var employeename: @NotNull @Size(min = 3, max = 20) String? = null
    var email: @NotNull @Size(max = 50) @Email String? = null
    var roles: Set<String>? = null
        private set
    var password: @NotNull @Size(min = 6, max = 40) String? = null
    fun setRole(roles: Set<String>?) {
        this.roles = roles
    }
}