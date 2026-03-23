package com.github.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.app.model.medico.DadosCadastroMedico;
import com.github.app.model.medico.Medico;
import com.github.app.model.medico.MedicoRepository;

@RestController //anotação do spring que indica 123
//  que essa classe é um controlador de requisições REST, 
// ou seja, ela vai receber requisições HTTP e retornar respostas HTTP
@RequestMapping("medicos")// anotação do spring que indica o caminho (endpoint) base para as 
// requisições, medicocontroller

public class MédicoController {
        @Autowired// anotação do spring que indica que o spring vai injetar uma instância do MedicoRepository nessa variável, ou seja, o spring vai criar um objeto do tipo MedicoRepository e atribuir a essa variável
        private MedicoRepository repository;

        @PostMapping// anotação do spring que indica que esse método vai responder
        //  a requisições HTTP POST (cadastrar)
        public void cadastrar(@RequestBody DadosCadastroMedico dados){
            repository.save(new Medico(dados));
           
        }

        
    
}
