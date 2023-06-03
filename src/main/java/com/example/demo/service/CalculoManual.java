package com.example.demo.service;


import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.demo.service.modelo.Matricula;

@Service("manual")
public class CalculoManual implements Calculo{
	private Matricula matricula;
	@Override
	public BigDecimal calcular() {
		BigDecimal importe = new BigDecimal(0);
		if(matricula.getVehiculo().getPlaca().equals("manual")) {
			importe = matricula.getVehiculo().getPrecio().multiply(new BigDecimal(0.1));
			
		}
		return importe;
	}

}
