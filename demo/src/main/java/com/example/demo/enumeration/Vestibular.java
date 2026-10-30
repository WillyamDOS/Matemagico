package com.example.demo.enumeration;

import lombok.Getter;

@Getter
public enum Vestibular {

    ENEM("ENEM"), UFRGS("UFRGS");

    private final String vestibular;

    private Vestibular (final String vestibular) {
        this.vestibular = vestibular;
    }

}
