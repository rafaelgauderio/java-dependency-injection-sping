package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {
	
	public double pension (double ammount) {
		return 0.075 * ammount;
	}

}
