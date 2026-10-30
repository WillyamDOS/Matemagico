package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("PROFESSOR")
public class ProfessorEntity extends UsuarioEntity{

    @Column
    private String nomeCompleto;

    @Column
    private String email;

    @Column
    private String cpf;

    @OneToMany(mappedBy = "professor")
    private List<QuestaoEntity> questoes = new ArrayList<>();

}
