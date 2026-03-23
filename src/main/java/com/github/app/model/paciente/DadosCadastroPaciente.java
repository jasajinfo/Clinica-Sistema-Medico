package com.github.app.model.paciente;

import com.github.app.model.endereco.DadosCadastroEndereco;
import com.github.app.model.medico.Especialidade;

public record DadosCadastroPaciente(

    String nome,
    String email, 
    String CPF, 
    String telefone

)   

    {
        
    }   
