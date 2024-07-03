package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.Ejemplo;

public interface EjemploService {

	public abstract Ejemplo insertaActualizaEjemplo(Ejemplo obj);

	public abstract List<Ejemplo> listaEjemplo();
}
