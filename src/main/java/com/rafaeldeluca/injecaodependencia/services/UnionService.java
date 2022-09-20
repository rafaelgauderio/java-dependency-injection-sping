package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Service;

@Service
public class UnionService {
	
	public double unionDues (double ammount) {		
		return 0.02 * ammount; 
	}

}
