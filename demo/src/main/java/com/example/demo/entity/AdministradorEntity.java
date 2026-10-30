package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("ADMINISTRADOR")
public class AdministradorEntity extends UsuarioEntity {}
