package com.example.demo.dto;

public record ProfessorDTO (String username, String senha, String nome_completo, String email, String cpf) implements UsuarioDTO {}
