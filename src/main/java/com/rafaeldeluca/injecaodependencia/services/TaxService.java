package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Component;

@Component
public class TaxService {
	
	public double tax(double amount) {
		return 0.27 * amount; 
	}

}
