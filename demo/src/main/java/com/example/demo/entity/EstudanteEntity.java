package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("ESTUDANTE")
public class EstudanteEntity extends UsuarioEntity {

    @Column
    private String nomeCompleto;

    @Column
    private String email;

}
