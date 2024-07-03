package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.Proveedor;

public interface ProveedorService {

	public abstract List<Proveedor> listaProveedor();

	public abstract Proveedor instertaProveedor(Proveedor obj);

}
