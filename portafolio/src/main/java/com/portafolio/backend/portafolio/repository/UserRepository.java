package com.portafolio.backend.portafolio.repository;

import com.portafolio.backend.portafolio.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findUserByUsername(String username);
}
