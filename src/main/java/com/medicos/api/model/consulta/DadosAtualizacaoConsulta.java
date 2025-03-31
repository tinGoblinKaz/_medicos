package com.medicos.api.model.consulta;

import java.time.LocalDateTime;

public record DadosAtualizacaoConsulta(Integer id, Integer medicoId, Integer pacieneteId, String observacao, Status status, LocalDateTime data) {
    
}
