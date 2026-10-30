package com.example.demo.dto;

public record EstudanteDTO (String username, String senha, String nome_completo, String email) implements UsuarioDTO {}
