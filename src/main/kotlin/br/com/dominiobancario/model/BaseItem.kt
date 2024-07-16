package br.com.dominiobancario.model

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseItem(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    open var icon: String,
    open var description: String
)
