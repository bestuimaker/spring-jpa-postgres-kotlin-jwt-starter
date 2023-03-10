package com.example.bestuimaker.model

import jakarta.persistence.*

@Entity
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = -1

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    var name: ERole? = null

    constructor() {}
    constructor(name: ERole?) {
        this.name = name
    }
}