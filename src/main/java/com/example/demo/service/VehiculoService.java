package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {
	public void insertarVehiculo(Vehiculo car);
	public void eliminarVehiculo(String placa);
	public Vehiculo busacrVehiculo(String placa);
	public void actualizarVehiculo(Vehiculo car);
	
}
