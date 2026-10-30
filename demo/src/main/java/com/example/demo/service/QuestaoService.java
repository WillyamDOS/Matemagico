package com.example.demo.service;

import com.example.demo.dto.QuestaoDTO;
import com.example.demo.entity.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class QuestaoService {

    private final HashMap<Long, QuestaoEntity> questoes = new HashMap<>();
    private long seq = 1L;

    public QuestaoEntity criar (QuestaoDTO dto) {

        QuestaoEntity questao = new QuestaoEntity();

        questao.setId(seq ++);
        questao.setAno(dto.ano());
        questao.setNumero(dto.numero());
        questao.setEnunciado(dto.enunciado());
        questao.setTitulo(dto.titulo());
        questao.setResolucaoTexto(dto.resolucao_texto());
        questao.setResolucaoImagem(dto.resolucao_imagem());
        questao.setResolucaoVideo(dto.resolucao_video());
        questao.setConteudos(dto.conteudos());
        questao.setVestibular(dto.vestibular());

        this.questoes.put(questao.getId(), questao);

        return questao;

    }

    public HashMap<Long, QuestaoEntity> listar () { return this.questoes; }

    public QuestaoEntity editar (long id, QuestaoDTO dto) {

        QuestaoEntity questao = this.questoes.get(id);

        questao.setAno(dto.ano());
        questao.setNumero(dto.numero());
        questao.setEnunciado(dto.enunciado());
        questao.setTitulo(dto.titulo());
        questao.setResolucaoTexto(dto.resolucao_texto());
        questao.setResolucaoImagem(dto.resolucao_imagem());
        questao.setResolucaoVideo(dto.resolucao_video());
        questao.setConteudos(dto.conteudos());
        questao.setVestibular(dto.vestibular());

        return questao;

    }

    public QuestaoEntity excluir (long id) { return this.questoes.remove(id); }

}
