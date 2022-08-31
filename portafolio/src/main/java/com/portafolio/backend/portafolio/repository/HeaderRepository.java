package com.portafolio.backend.portafolio.repository;

import com.portafolio.backend.portafolio.models.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository<Header, Integer> {
}
