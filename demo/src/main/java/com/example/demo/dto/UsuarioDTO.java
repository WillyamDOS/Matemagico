package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "tipo_usuario"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AdministradorDTO.class, name = "ADMINISTRADOR"),
        @JsonSubTypes.Type(value = EstudanteDTO.class, name = "ESTUDANTE"),
        @JsonSubTypes.Type(value = ProfessorDTO.class, name = "PROFESSOR") // Se houver
})
public sealed interface UsuarioDTO permits AdministradorDTO, EstudanteDTO, ProfessorDTO {}

