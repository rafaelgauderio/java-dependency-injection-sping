package com.rafaeldeluca.injecaodependencia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafaeldeluca.injecaodependencia.services.PensionService;
import com.rafaeldeluca.injecaodependencia.services.RichTaxService;
import com.rafaeldeluca.injecaodependencia.services.SalaryService;
import com.rafaeldeluca.injecaodependencia.services.TaxService;
import com.rafaeldeluca.injecaodependencia.services.UnionService;

@SpringBootApplication
public class InjecaoDependenciaApplication implements CommandLineRunner {
	
	private SalaryService salaryService;	
	

	public InjecaoDependenciaApplication(SalaryService salaryService) {		
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaApplication.class, args);
	}
	
	@Override
	public void run (String...args) throws Exception {
		
		System.out.println("\nNet Salary : " + String.format("U$ %.2f", salaryService.netSalary(10000)));
		System.out.println("\nNet Salary : " + String.format("U$ %.2f", salaryService.netSalary(8000)));
	}

}
