package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

	public List<Vehiculo> baseVehiculo ;
	
	@Override
	public void crearVehiculo(Vehiculo car) {
		baseVehiculo.add(car);
	}

	@Override
	public void eliminarVehiculo(String placa) {
		Vehiculo eliminar =this.seleccionarVehiculo(placa);
		baseVehiculo.remove(eliminar);
		
	}

	@Override
	public Vehiculo seleccionarVehiculo(String placa) {
		Vehiculo encontrado = new Vehiculo();
		for(Vehiculo e:baseVehiculo) {
			if(e.getPlaca().equals(placa)) {
				encontrado = e;
			}
		}
		return encontrado;
	}

	@Override
	public void actualizarVehiculo(Vehiculo car) {
		this.eliminarVehiculo(car.getPlaca());
		baseVehiculo.add(car);
	}

	@Override
	public List<Vehiculo> listarTodo() {
		// TODO Auto-generated method stub
		return baseVehiculo;
	}

}
