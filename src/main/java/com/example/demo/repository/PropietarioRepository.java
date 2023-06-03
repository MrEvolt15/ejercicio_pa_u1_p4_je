package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioRepository {
	public void crearPropietario(Propietario propietario);
	public void eliminarPropietario(int identificacion);
}
