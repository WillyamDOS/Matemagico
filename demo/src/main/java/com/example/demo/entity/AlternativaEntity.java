package com.example.demo.entity;

import com.example.demo.enumeration.Letra;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "alternativas")
public class AlternativaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private boolean correta;

    @Column
    private String texto;

    @Column
    private Letra letra;

    @ManyToOne
    @JoinColumn(name = "questao_id")
    private QuestaoEntity questao = new QuestaoEntity();


}
