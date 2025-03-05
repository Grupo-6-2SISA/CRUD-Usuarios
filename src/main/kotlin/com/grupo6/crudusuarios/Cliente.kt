package com.grupo6.crudusuarios

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate

data class Cliente (
    var nome: String,
    var cpf: String? = null,
    var cnpj: String? = null,
    var telefone: String,
    var email: String,
    var rg: String? = null,
    var causa: String? = null,
    var dtNasc: LocalDate? = null,
    var proAbono: Boolean? = null
){

}