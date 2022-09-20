package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Component;

@Component
public class RichTaxService extends TaxService {
	

	@Override
	public double tax(double ammount) {
		return 0.30 * ammount; 
	}

}
