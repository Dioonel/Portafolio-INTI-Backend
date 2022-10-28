package com.portafolio.backend.portafolio.repository;

import com.portafolio.backend.portafolio.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Integer> {
    public List<Project> findAllByOrderByIdAsc();
}
