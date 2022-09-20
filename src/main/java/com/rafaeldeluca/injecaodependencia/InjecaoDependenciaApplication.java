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
	
	TaxService taxService = new TaxService();
	PensionService pensionService = new PensionService();
	UnionService unionService = new UnionService();
	RichTaxService richTaxService = new RichTaxService();
	
	SalaryService salaryRich = new SalaryService(richTaxService, pensionService, unionService);
	SalaryService salaryDefault = new SalaryService(taxService, pensionService, unionService);
	

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaApplication.class, args);
	}
	
	@Override
	public void run (String...args) throws Exception {
		
		System.out.println("\nNet Salary : " + String.format("U$ %.2f", salaryRich.netSalary(10000)));
		System.out.println("\nNet Salary : " + String.format("U$ %.2f", salaryDefault.netSalary(10000)));
	}

}
