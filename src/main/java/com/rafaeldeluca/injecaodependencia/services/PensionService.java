package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Component;

@Component
public class PensionService {
	
	public double pension (double ammount) {
		return 0.075 * ammount;
	}

}
