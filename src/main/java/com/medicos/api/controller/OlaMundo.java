package com.medicos.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/olamundo")
@RestController
public class OlaMundo {
    @GetMapping
    public String olaMundo(){
        return "Olá Mundo";
    }
}


// localhost:8080 -> URL inicial.
// localhost:8080/medicos
// localhost:8080/pacientes/consultas
// localhost:8080/olamundo