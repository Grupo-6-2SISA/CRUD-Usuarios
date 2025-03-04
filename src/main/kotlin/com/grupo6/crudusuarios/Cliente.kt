package com.grupo6.crudusuarios

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate

data class Cliente (
    var nome: String? = null,
    var cpf: String? = null,
    var telefone: String? = null,
    var email: String? = null,
    var sexo: String? = null,
    var rg: String? = null,
    var causa: String? = null,
    var dtNasc: LocalDate? = null,
    var proAbono: Boolean? = null
){

}