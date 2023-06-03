package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public class PropietarioRepositoryImpl implements PropietarioRepository{

	public List<Propietario> basePropietarios;
	@Override
	public void crearPropietario(Propietario propietario) {
		basePropietarios.add(propietario);
	}

	@Override
	public void eliminarPropietario(int identificacion) {
		Propietario encontrado = new Propietario();
		for(Propietario e :basePropietarios) {
			if(identificacion ==e.getIdentificacion()) {
				e= encontrado;
			}
		}
		
		basePropietarios.remove(encontrado);
	}

}
