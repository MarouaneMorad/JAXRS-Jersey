package com.example.tp07_jaxrs_Jersey.repositories;

import com.example.tp07_jaxrs_Jersey.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}