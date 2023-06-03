package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService{
	@Autowired
	private VehiculoRepository vehiculoRepository;
	@Override
	public void insertarVehiculo(Vehiculo car) {
		this.vehiculoRepository.crearVehiculo(car);
	}

	@Override
	public void eliminarVehiculo(String placa) {
		this.vehiculoRepository.eliminarVehiculo(placa);
	}

	@Override
	public Vehiculo busacrVehiculo(String placa) {
		
		return this.vehiculoRepository.seleccionarVehiculo(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo car) {
		this.vehiculoRepository.actualizarVehiculo(car);
	}

}
