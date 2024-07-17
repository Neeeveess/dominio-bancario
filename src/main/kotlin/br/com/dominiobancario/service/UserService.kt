package br.com.dominiobancario.service

import br.com.dominiobancario.model.User

interface UserService {
    fun findById(id: Long): User;

    fun create(userToCreate: User): User;
}