package com.example.demo.dto;

import com.example.demo.enumeration.Conteudo;
import com.example.demo.enumeration.Vestibular;

import java.util.List;

public record QuestaoDTO (Vestibular vestibular, int ano, int numero, String enunciado, String titulo, String resolucao_texto, String resolucao_imagem, String resolucao_video, List<Conteudo> conteudos) {}
