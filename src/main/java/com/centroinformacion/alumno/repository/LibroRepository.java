package com.centroinformacion.alumno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.alumno.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
