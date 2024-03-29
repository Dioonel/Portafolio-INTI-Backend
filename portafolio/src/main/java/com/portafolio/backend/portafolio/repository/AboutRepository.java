package com.portafolio.backend.portafolio.repository;

import com.portafolio.backend.portafolio.models.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About, Integer> {
}
