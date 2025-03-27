package com.medicos.api.model.paciente;

import com.medicos.api.model.endereco.DadosEndereco;

public record DadosCadastroPaciente(Integer id, String nome, String email, String telefone, DadosEndereco endereco) {

}
