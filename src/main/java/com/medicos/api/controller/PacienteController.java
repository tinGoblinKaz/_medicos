package com.medicos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicos.api.model.paciente.DadosAtualizacaoPaciente;
import com.medicos.api.model.paciente.DadosCadastroPaciente;
import com.medicos.api.model.paciente.Paciente;
import com.medicos.api.model.paciente.PacienteRepository;

@RestController
@RequestMapping("/pacientes")

public class PacienteController {
     @Autowired // Sobrescrevendo algo, é um padrão utilizado na injeção de depêndencia
    private PacienteRepository repository;

    //Aqui fica o método de criação
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPaciente dados ) {
        repository.save(new Paciente(dados));
    }
    //Aqui fica o método de atualização - UPDATE
    // nome, email, endereço
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoPaciente dados){
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }
    


    //Aqui fica o método de exclusão- DELETE

    //  Exclusão - Estou excluind mesmo.
    // @DeleteMapping("/{id}")
    // @Transactional
    // public void excluir(@PathVariable Integer id){
    //     repository.deleteById(id);
    // }
    
    //Exclusão lógica - Uma regra de negócio que permite que um registro seja excluído sem apagar do banco de dados.
    @DeleteMapping("/{id}")
    @Transactional
    public void exclusaoLogica(@PathVariable Integer id){
        var paciente = repository.getReferenceById(id);
        paciente.exclusaoLogica();
    }
}
