package br.com.dominiobancario.repository

import br.com.dominiobancario.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}