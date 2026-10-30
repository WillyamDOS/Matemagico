package com.example.demo.entity;

import com.example.demo.enumeration.Conteudo;
import com.example.demo.enumeration.Vestibular;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "questoes")
public class QuestaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int ano;

    @Column
    private int numero;

    @Column
    private String enunciado;

    @Column
    private String titulo;

    @Column
    private String resolucaoTexto;

    @Column
    private String resolucaoImagem;

    @Column
    private String resolucaoVideo;

    @Column
    private List<Conteudo> conteudos;

    @Column
    private Vestibular vestibular;

    @OneToMany(mappedBy = "questao")
    private List<AlternativaEntity> alternativas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private ProfessorEntity professor = new ProfessorEntity();


}
