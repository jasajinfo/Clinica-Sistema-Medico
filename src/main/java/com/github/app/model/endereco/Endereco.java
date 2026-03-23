package com.github.app.model.endereco;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco{
    //Atributos caracteristica  variaveis   

    private String cep;
    private String complemento;
    private String cidade;
    private String uf;
    private String logradouro;
    private String bairro;
//Constructor recebendo os dados convertidos DTO
@Embeddable 
public Endereco (DadosCadastroEndereco dados){
    this.logradouro = dados.logradouro();
    this.bairro = dados.logradouro();
    this.cep =  dados.cep() ;
    this.complemento = dados.complemento();
    this.cidade = dados.cidade();    
    this.uf = dados.uf();   






}







}     