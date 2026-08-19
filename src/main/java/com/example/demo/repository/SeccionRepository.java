package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Seccion;

public interface SeccionRepository extends JpaRepository<Seccion, String> {
}