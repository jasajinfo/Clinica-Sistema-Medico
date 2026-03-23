package com.github.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.app.model.paciente.DadosCadastroPaciente;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("Pacientes")
public class PacienteController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        System.out.print(dados); 
    }
    
    
}
