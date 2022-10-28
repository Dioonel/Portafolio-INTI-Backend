package com.portafolio.backend.portafolio.repository;

import com.portafolio.backend.portafolio.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
    public List<Skill> findAllByOrderByIdAsc();
}
