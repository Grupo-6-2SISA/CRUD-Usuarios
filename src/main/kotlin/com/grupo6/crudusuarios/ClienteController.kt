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
        clientes.add(novoCliente)
        return ResponseEntity.status(201).body(novoCliente)
    }

    @DeleteMapping("/{id}")
    fun excluir(@PathVariable id: Int): ResponseEntity<String> {
        return if (id in clientes.indices) {
            clientes.removeAt(id)
            ResponseEntity.status(200).body("Cliente excluído com sucesso")
        } else {
            ResponseEntity.status(404).body("Cliente não encontrado")
        }

    }

    @GetMapping
    fun listar(): ResponseEntity<List<Cliente>> {
        return if (clientes.isEmpty()) {
            ResponseEntity.status(204).build()
        } else {
            ResponseEntity.status(200).body(clientes)
        }

    }

    @PutMapping("/{id}")
    fun atualizar(@PathVariable id : Int, @RequestBody clienteAtualizado: Cliente): ResponseEntity<Cliente> {
        return if (id in 0 until clientes.size) {
            clientes[id] = clienteAtualizado
            ResponseEntity.status(200).body(clienteAtualizado)
        } else {
            ResponseEntity.status(404).build()
        }
    }


    @PatchMapping("/{id}/{novoEmail}")
    fun atualizarEmail(@PathVariable id:Int, @PathVariable novoEmail:String): String {
        clientes[id].email = novoEmail
        return "Email atualizado com sucesso"
    }


}   
        



    

