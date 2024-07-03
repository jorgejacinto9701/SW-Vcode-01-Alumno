package com.centroinformacion.alumno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.alumno.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
