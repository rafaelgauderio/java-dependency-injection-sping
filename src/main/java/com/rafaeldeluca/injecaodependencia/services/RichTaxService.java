package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Service;

@Service
public class RichTaxService extends TaxService {
	

	@Override
	public double tax(double ammount) {
		return 0.30 * ammount; 
	}

}
