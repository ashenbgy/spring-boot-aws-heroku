package com.alpha.springbootawsheroku.repository;

import com.alpha.springbootawsheroku.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
