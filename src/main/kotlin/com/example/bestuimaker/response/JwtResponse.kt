package com.example.bestuimaker.response

class JwtResponse(
    var accessToken: String, var id: Long,
    var employeename: String, var email: String, val roles: List<String>
) {
    var tokenType = "Bearer"

}