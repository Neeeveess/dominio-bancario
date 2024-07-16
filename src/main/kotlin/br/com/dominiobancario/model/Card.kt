package br.com.dominiobancario.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity(name = "tb_card")
data class Card(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(unique = true)
    val number: String,

    @Column(name = "available_limit", scale = 13, precision = 2)
    val limit: BigDecimal
)
