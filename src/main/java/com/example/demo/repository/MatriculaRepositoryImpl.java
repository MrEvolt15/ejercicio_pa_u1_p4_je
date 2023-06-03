package com.example.demo.repository;

import java.util.List;

import com.example.demo.service.modelo.Matricula;

public class MatriculaRepositoryImpl implements MatriculaRepository{
	List<Matricula> baseMatriculas;

	@Override
	public void crearMatricula(Matricula matricula) {
		baseMatriculas.add(matricula);
	}
	
}
