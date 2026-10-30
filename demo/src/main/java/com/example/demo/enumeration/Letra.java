package com.example.demo.enumeration;

import lombok.Getter;

@Getter
public enum Letra {

    A('A'), B('B'), C('C'), D('D'), E('E');

    private final char letra;

    private Letra (final char letra) {
        this.letra = letra;
    }

}
