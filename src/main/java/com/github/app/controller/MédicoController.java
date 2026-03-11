package com.github.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.app.model.medico.DadosCadastroMedico;

@RestController //anotação do spring que indica
//  que essa classe é um controlador de requisições REST, 
// ou seja, ela vai receber requisições HTTP e retornar respostas HTTP
@RequestMapping("medicos")// anotação do spring que indica o caminho (endpoint) base para as 
// requisições, medicocontroller

public class MédicoController {

        @PostMapping// anotação do spring que indica que esse método vai responder
        //  a requisições HTTP POST (cadastrar)
        public void cadastrar(@RequestBody DadosCadastroMedico dados){
            System.out.print(dados);
        }

        
    
}
