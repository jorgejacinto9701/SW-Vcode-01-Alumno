package com.centroinformacion.alumno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.alumno.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

}