package br.com.dominiobancario.controller

import br.com.dominiobancario.model.User
import br.com.dominiobancario.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.net.URI

@RestController
@RequestMapping("/users")
class UserController(
    val userService: UserService
) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<User>{
        val user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    fun create(@RequestBody userToCreate: User): ResponseEntity<User>{
        val userCreated = userService.create(userToCreate);
        val location : URI = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(userCreated.id)
            .toUri()
        return ResponseEntity.created(location).body(userCreated);
    }
}