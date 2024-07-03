package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaTodos();

	public abstract Alumno insertaAlumno(Alumno obj);

}
