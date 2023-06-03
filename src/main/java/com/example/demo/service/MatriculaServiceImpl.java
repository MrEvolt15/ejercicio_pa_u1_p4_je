package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.service.modelo.Matricula;

public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepository matriculaRepository;
	@Autowired
	@Qualifier("manual")
	private Calculo calculoM;
	@Autowired
	@Qualifier("automatico")
	private Calculo calculoA;
	
	private Matricula matricula = new Matricula();
	

	

	@Override
	public void crearMatricula(String identificacion, int placa) {
		
		BigDecimal calculo = new BigDecimal(0);
		if(matricula.getVehiculo().getPlaca().equals("manual")) {
			matricula.setValorMatricula(this.calculoM.calcular());
			
		}else if (matricula.getVehiculo().getPlaca().equals("automatico")) {
			matricula.setValorMatricula(this.calculoA.calcular());
			
		}
		
	}

}
