package com.centroinformacion.alumno.service;

import java.util.List;

import com.centroinformacion.alumno.entity.DataCatalogo;

public interface DataCatalogoService {

	public abstract List<DataCatalogo> listaDataCatalogo(int idTipo);

}
