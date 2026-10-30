package com.example.demo.service;


import com.example.demo.dto.AdministradorDTO;
import com.example.demo.dto.EstudanteDTO;
import com.example.demo.dto.ProfessorDTO;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entity.AdministradorEntity;
import com.example.demo.entity.EstudanteEntity;
import com.example.demo.entity.ProfessorEntity;
import com.example.demo.entity.UsuarioEntity;
import com.example.demo.repository.AdministradorRepository;
import com.example.demo.repository.EstudanteRepository;
import com.example.demo.repository.ProfessorRepository;
import com.example.demo.repository.UsuarioRepository;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Service
@NoArgsConstructor
@Primary
public class UsuarioService {

    @Autowired
    private AdministradorRepository administradores;

    @Autowired
    private EstudanteRepository estudantes;

    @Autowired
    private ProfessorRepository professores;

    public UsuarioService(AdministradorRepository administradores, ProfessorRepository professores, EstudanteRepository estudantes) {
        this.administradores = administradores;
        this.estudantes = estudantes;
        this.professores = professores;
    }

    @Transactional
    public UsuarioEntity criar (UsuarioDTO dto) {

        UsuarioEntity usuario = null;

        if (dto instanceof AdministradorDTO) {
            usuario = new AdministradorEntity();
            usuario.setUsername(((AdministradorDTO) dto).username());
            usuario.setSenha(((AdministradorDTO) dto).senha());
            administradores.saveAndFlush((AdministradorEntity) usuario);
        }

        if (dto instanceof EstudanteDTO) {
            usuario = new EstudanteEntity();
            usuario.setUsername(((EstudanteDTO) dto).username());
            usuario.setSenha(((EstudanteDTO) dto).senha());
            ((EstudanteEntity) usuario).setEmail(((EstudanteDTO) dto).email());
            ((EstudanteEntity) usuario).setNomeCompleto(((EstudanteDTO) dto).nome_completo());
            estudantes.saveAndFlush((EstudanteEntity) usuario);
        }

        if (dto instanceof ProfessorDTO) {
            usuario = new ProfessorEntity();
            usuario.setUsername(((ProfessorDTO) dto).username());
            usuario.setSenha(((ProfessorDTO) dto).senha());
            ((ProfessorEntity) usuario).setEmail(((ProfessorDTO) dto).email());
            ((ProfessorEntity) usuario).setNomeCompleto(((ProfessorDTO) dto).nome_completo());
            ((ProfessorEntity) usuario).setCpf(((ProfessorDTO) dto).cpf());
            professores.saveAndFlush((ProfessorEntity) usuario);
        }

        return usuario;

    }

    public List<EstudanteEntity> listar () { return estudantes.findAll(); }

    public UsuarioEntity editar (Long id, Record dto) {

        UsuarioEntity usuario = estudantes.getReferenceById(id);

        if (dto instanceof AdministradorDTO) {
            usuario.setUsername(((AdministradorDTO) dto).username());
            usuario.setSenha(((AdministradorDTO) dto).senha());
        }

        if (dto instanceof EstudanteDTO) {
            usuario.setUsername(((EstudanteDTO) dto).username());
            usuario.setSenha(((EstudanteDTO) dto).senha());
            ((EstudanteEntity) usuario).setEmail(((EstudanteDTO) dto).email());
            ((EstudanteEntity) usuario).setNomeCompleto(((EstudanteDTO) dto).nome_completo());
        }

        if (dto instanceof ProfessorDTO) {
            usuario.setUsername(((ProfessorDTO) dto).username());
            usuario.setSenha(((ProfessorDTO) dto).senha());
            ((ProfessorEntity) usuario).setEmail(((ProfessorDTO) dto).email());
            ((ProfessorEntity) usuario).setNomeCompleto(((ProfessorDTO) dto).nome_completo());
            ((ProfessorEntity) usuario).setCpf(((ProfessorDTO) dto).cpf());
        }

        return usuario;

    }

    public void excluir (Long id) { estudantes.deleteById(id); }

}
