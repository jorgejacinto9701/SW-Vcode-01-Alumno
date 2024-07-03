package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.Sala;

public interface SalaService {
	public abstract Sala insertaActualizaSala(Sala obj);

	public abstract List<Sala> listaSala();
}
