package com.example.demo.controller;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entity.EstudanteEntity;
import com.example.demo.entity.UsuarioEntity;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    public UsuarioController(@Qualifier("usuarioService") UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public UsuarioEntity criarUsuario(@RequestBody UsuarioDTO dto) {
        return service.criar(dto);
    }

}
