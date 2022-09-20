package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
	
	public double tax(double amount) {
		return 0.27 * amount; 
	}

}
