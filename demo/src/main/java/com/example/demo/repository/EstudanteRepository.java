package com.example.demo.repository;

import com.example.demo.entity.EstudanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<EstudanteEntity, Long> {
}
