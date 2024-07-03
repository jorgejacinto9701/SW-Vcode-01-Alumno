package com.centroinformacion.alumno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.alumno.entity.Sala;

public interface SalaRepository extends JpaRepository<Sala, Integer> {

}
