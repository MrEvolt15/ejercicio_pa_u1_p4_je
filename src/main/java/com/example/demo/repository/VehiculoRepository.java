package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoRepository {
	
	public void crearVehiculo(Vehiculo car);
	public void eliminarVehiculo(String placa);
	public Vehiculo seleccionarVehiculo(String placa);
	public void actualizarVehiculo(Vehiculo car);
	public List<Vehiculo> listarTodo();
	
}
