package com.github.app.model.medico;
//classe modelo responsp por criar tabelas e colunas no bd

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
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
public class Medico {
    @Id // anotação do spring que indica que esse atributo é a chave primária da tabela no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)// anotação do spring que indica que o valor desse atributo 
    // vai ser gerado automaticamente pelo banco de dados, usando a estratégia de identidade (auto-incremento)  
    private Integer id; // não está vindo do insomnia.  Vem do Sripring JPA e cria o id de forma utomática
    private String nome;
    private String email;                       
    private String crm;
  private Especialidade especialidade; 
  
  @enbedded //utiliza a classe pai, associs uma entidade a uma tabela auxiliar

  private Endereco endereco;
  
  //Construtor que recebe um objeto do tipo DadosCadastroMedico e inicializa os atributos do médico com os valores desse objeto
  public Medico(DadosCadastroMedico dados) {
    this.nome = dados.nome();
    this.email = dados.email();
    this.crm = dados.crm();
    this.especialidade = dados.especialidade();
  }
}