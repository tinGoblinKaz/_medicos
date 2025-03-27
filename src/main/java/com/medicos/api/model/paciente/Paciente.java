package com.medicos.api.model.paciente;

import com.medicos.api.model.endereco.Endereco;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private Boolean ativo = true;
   
    @Embedded
    private Endereco endereco;

    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.endereco = new Endereco(dados.endereco());
    }
    //Método responsável por realizar a verificação de qual campo está sendo utilizado.
    public void atualizarInformacoes(DadosAtualizacaoPaciente dados){
        if (dados.nome()!=null){
            this.nome = dados.nome();
        }
        if (dados.email()!=null){
            this.email = dados.email();
        }
        if (dados.endereco()!=null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }
    public void exclusaoLogica(){
        this.ativo = false;
    }


}

