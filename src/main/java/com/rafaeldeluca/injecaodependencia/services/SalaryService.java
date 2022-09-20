package com.rafaeldeluca.injecaodependencia.services;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {
	
	private TaxService taxService;
	private PensionService pensionService;
	private UnionService unionService;
	
	
	public SalaryService(TaxService taxService, PensionService pensionService, UnionService unionService) {
		super();
		this.taxService = taxService;
		this.pensionService = pensionService;
		this.unionService = unionService;
	}
	
	public double netSalary (double grossSalary) {
		double netSalary = grossSalary - taxService.tax(grossSalary) - pensionService.pension(grossSalary) - unionService.unionDues(grossSalary);
		return netSalary;
	}
	
	

}
