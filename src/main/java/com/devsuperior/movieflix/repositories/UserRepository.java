package com.devsuperior.movieflix.repositories;

import org.springframework.stereotype.Repository;

import com.devsuperior.movieflix.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(String email);
}
