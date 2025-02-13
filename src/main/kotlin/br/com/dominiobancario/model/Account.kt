package br.com.dominiobancario.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity(name = "tb_account")
data class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(unique = true)
    val number: String,

    val agency: String,

    @Column( precision = 13, scale = 2 )
    val balance: BigDecimal,

    @Column(name = "additional_limit", precision = 13, scale = 2)
    val limit: BigDecimal
)
