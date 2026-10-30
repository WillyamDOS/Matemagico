package com.example.demo.enumeration;

import lombok.Getter;

@Getter
public enum Conteudo {

    ALGEBRA("Álgebra"),
    ANALISE_COMBINATORIA("Análise combinatória"),
    ANGULOS("Ângulos"),
    ARCOS("Arcos"),
    CONJUNTOS_NUMERICOS("Conjuntos numéricos"),
    COSENO("Cosseno"),
    FUNCAO_AFIM("Função afim"),
    FUNCAO_COSENO("Função cosseno"),
    FUNCAO_DE_PRIMEIRO_GRAU("Função de primeiro grau"),
    FUNCAO_DE_SEGUNDO_GRAU("Função de segundo grau"),
    FUNCAO_EXPONENCIAL("Função exponencial"),
    FUNCAO_LOGARITMICA("Função logarítmica"),
    FUNCAO_QUADRATICA("Função quadrática"),
    FUNCAO_SENO("Função seno"),
    FUNCAO_TANGENTE("Função tangente"),
    GEOMETRIA_ANALITICA("Geometria analítica"),
    GEOMETRIA_ESPACIAL("Geometria espacial"),
    GEOMETRIA_PLANA("Geometria plana"),
    GRAFICO("Gráfico"),
    LOGARITMO("Logaritmo"),
    MATRIZES("Matrizes"),
    MEDIA("Média"),
    MEDIANA("Mediana"),
    MODA("Moda"),
    OUTRO("Outro"),
    PA("PA"),
    PG("PG"),
    POLINOMIOS("Polinômios"),
    PORCENTAGEM("Porcentagem"),
    PROBABILIDADE("Probabilidade"),
    PROPORCAO("Proporção"),
    RAZAO("Razão"),
    REGRA_DE_TRES("Regra de três"),
    SENO("Seno"),
    TANGENTE("Tangente"),
    TRIGONOMETRIA("Trigonometria");

    private final String conteudo;

    private Conteudo (final String conteudo) {
        this.conteudo = conteudo;
    }

}
