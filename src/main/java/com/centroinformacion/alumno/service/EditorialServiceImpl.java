package com.centroinformacion.alumno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.alumno.entity.Editorial;
import com.centroinformacion.alumno.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService {

	@Autowired
	private EditorialRepository repository;

	@Override
	public Editorial registrarEditorial(Editorial editorial) {

		return repository.save(editorial);

	}

}
