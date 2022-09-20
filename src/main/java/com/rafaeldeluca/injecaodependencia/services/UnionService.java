package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Component;

@Component
public class UnionService {
	
	public double unionDues (double ammount) {		
		return 0.02 * ammount; 
	}

}
