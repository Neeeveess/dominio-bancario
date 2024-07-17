package br.com.dominiobancario.service.impl

import br.com.dominiobancario.model.User
import br.com.dominiobancario.repository.UserRepository
import br.com.dominiobancario.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    val userRepository: UserRepository
): UserService {

    override fun findById(id: Long): User {
        return userRepository.findById(id).orElseThrow{NoSuchElementException()}
    }

    override fun create(userToCreate: User): User {
        if(userRepository.existsByAccountNumber(userToCreate.account.number)){
            throw IllegalArgumentException("This Account number already exists.")
        }
        try {
            return userRepository.save(userToCreate)
        } catch (e: Exception) {
            // Log the exception or handle it as necessary
            throw RuntimeException("Error saving user: ${e.message}", e)
        }
    }
}