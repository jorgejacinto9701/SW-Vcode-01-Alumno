package com.centroinformacion.alumno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.alumno.entity.Pais;

public interface PaisRepository extends JpaRepository<Pais, Integer> {

	public abstract List<Pais> findByOrderByNombreAsc();

}
