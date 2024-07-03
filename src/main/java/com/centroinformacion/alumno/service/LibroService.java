package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.Libro;

public interface LibroService {

	public abstract List<Libro> listaLibro();

	public abstract Libro insertarLibro(Libro obj);

}
