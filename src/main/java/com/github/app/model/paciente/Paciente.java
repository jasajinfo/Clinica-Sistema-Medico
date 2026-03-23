package com.github.app.model.paciente;


import com.github.app.model.endereco.Endereco;

import jakarta.persistence.Embedded;

public class Paciente {
    private String nome;
    private String email; 
    private String CPF;
    private String telefone;
   
    @Embedded

    private Endereco endereco;
}
