package com.medicos.api.model.medico;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;

import com.medicos.api.model.endereco.Endereco;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import jakarta.transaction.Transactional;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String crm;
    private Boolean ativo = true;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
    //Método responsável por realizar a verificação de qual campo está sendo utilizado.
    public void atualizarInformacoes(DadosAtualizacaoMedico dados){
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
