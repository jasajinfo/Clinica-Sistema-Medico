package com.github.app.model.medico;

import com.github.app.model.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(
    String nome,
    String email, 
    String crm, 
    Especialidade especialidade, 
    DadosCadastroEndereco endereco

) {
    
}

//essa classe é responsavel por ligar os dados que estão vindo no simulador de requisição
// e transformar em atributos(variáveis) de uma entidade chamada médico 
// A classe record cria todos os getters e setters constructiors, hash code e equals.