package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {
	
	@Autowired
	private TaxService taxService;
	@Autowired
	private PensionService pensionService;
	@Autowired
	private UnionService unionService;	
	
	
	public double netSalary (double grossSalary) {
		double netSalary = grossSalary - taxService.tax(grossSalary) - pensionService.pension(grossSalary) - unionService.unionDues(grossSalary);
		return netSalary;
	}
	
	

}
