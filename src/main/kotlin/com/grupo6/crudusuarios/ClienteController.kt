package com.grupo6.crudusuarios

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/cliente")
class ClienteController {

    val clientes = mutableListOf<Cliente>()

    @PostMapping
    fun criar(@RequestBody novoCliente: Cliente): ResponseEntity<Any> {
        return if (novoCliente.nome != null &&
            novoCliente.cpf != null &&
            novoCliente.rg != null &&
            novoCliente.causa != null &&
            novoCliente.sexo != null &&
            novoCliente.telefone != null &&
            novoCliente.email != null &&
            novoCliente.proAbono != null &&
            novoCliente.dtNasc != null
        ) {
            clientes.add(novoCliente)
            ResponseEntity.status(201).body(novoCliente)
        } else {
            ResponseEntity.status(400).body(mapOf("error" to "Dados inválidos ou incompletos"))
        }
    }

    @DeleteMapping("/{id}")
    fun excluir(@PathVariable id: Int): ResponseEntity<String> {
        return if (id in clientes.indices) {
            clientes.removeAt(id)
            ResponseEntity.ok("Cliente excluído com sucesso")
        } else {
            ResponseEntity.status(404).body("Cliente não encontrado")
        }

    }}