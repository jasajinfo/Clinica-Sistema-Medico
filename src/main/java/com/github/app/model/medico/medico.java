package com.github.app.model.medico;
//classe modelo responsp por criar tabelas e colunas no bd

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //lombok cria get para todos os atributos
@Setter // lombok cria set para todos os atributos
@AllArgsConstructor //lombok cria um construtor com todos os argumentos
@NoArgsConstructor //lombok cria um construtor sem argumentos 
@EqualsAndHashCode  (of = "id")//lombok cria o hash code e equals usando apenas o id, ou seja, o id é o atributo que define a identidade do médico
@Entity// anotação do spring que indica que essa classe é uma entidade, ou seja, ela vai ser mapeada para uma tabela no banco de dados
@Table(name = "medicos")// anotação do spring que indica o nome da tabela no banco de dados, nesse caso, medicos   
//SRING JPA *oPCIONAL, GERA UMA TABELA COM O NOME MÉDICOS NO bd 
public class medico {
    @Id // anotação do spring que indica que esse atributo é a chave primária da tabela no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)// anotação do spring que indica que o valor desse atributo 
    // vai ser gerado automaticamente pelo banco de dados, usando a estratégia de identidade (auto-incremento)  
    private Integer id; // não está vindo do insomnia.  Vem do Sripring JPA e cria o id de forma utomática
    private String nome;
    private String email;                       
    private String crm;
   @Enumerated(EnumType.STRING) // anotação do spring que indica que esse atributo é um enum e deve ser armazenado como string no banco de dados 
   //SPING JPA  Informa para o db que o tributo é do tipo enum    
    private Especialidade especialidade;    
    
}