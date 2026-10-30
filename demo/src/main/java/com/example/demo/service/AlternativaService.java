package com.example.demo.service;

import com.example.demo.dto.AlternativaDTO;
import com.example.demo.entity.AlternativaEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AlternativaService {

    private final HashMap<Long, AlternativaEntity> alternativas = new HashMap<>();
    private long seq = 1L;

    public AlternativaEntity criar (AlternativaDTO dto) {

        AlternativaEntity alternativa = new AlternativaEntity();

        alternativa.setId(seq ++);
        alternativa.setCorreta(dto.correta());
        alternativa.setTexto(dto.texto());
        alternativa.setLetra(dto.letra());

        this.alternativas.put(alternativa.getId(), alternativa);

        return alternativa;

    }

    public HashMap<Long, AlternativaEntity> listar () { return this.alternativas; }

    public AlternativaEntity editar (long id, AlternativaDTO dto) {

        AlternativaEntity alternativa = this.alternativas.get(id);

        alternativa.setCorreta(dto.correta());
        alternativa.setTexto(dto.texto());
        alternativa.setLetra(dto.letra());

        return alternativa;

    }

    public AlternativaEntity excluir (long id) { return this.alternativas.remove(id); }
    
}
