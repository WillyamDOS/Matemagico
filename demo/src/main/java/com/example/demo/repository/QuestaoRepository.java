package com.example.demo.repository;

import com.example.demo.entity.QuestaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestaoRepository extends JpaRepository<QuestaoEntity, Long>{
}