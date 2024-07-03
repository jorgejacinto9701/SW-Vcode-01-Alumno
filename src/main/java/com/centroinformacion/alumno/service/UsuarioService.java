package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.Opcion;
import com.centroinformacion.alumno.entity.Rol;
import com.centroinformacion.alumno.entity.Usuario;

public interface UsuarioService {

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);
}
