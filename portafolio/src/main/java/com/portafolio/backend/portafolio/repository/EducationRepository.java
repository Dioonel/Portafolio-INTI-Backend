package com.portafolio.backend.portafolio.repository;

import com.portafolio.backend.portafolio.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
    public List<Education> findAllByOrderByIdAsc();
}
