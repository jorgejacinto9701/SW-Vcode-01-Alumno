package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.Autor;

public interface AutorService {

	public abstract Autor insertaActualizaAutor(Autor obj);

	public abstract List<Autor> listaAutor();
}
