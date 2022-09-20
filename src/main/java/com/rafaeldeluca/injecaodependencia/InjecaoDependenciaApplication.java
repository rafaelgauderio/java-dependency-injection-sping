package com.rafaeldeluca.injecaodependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafaeldeluca.injecaodependencia.services.SalaryService;

@SpringBootApplication
public class InjecaoDependenciaApplication implements CommandLineRunner {
	
	@Autowired
	private SalaryService salaryService;	

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaApplication.class, args);
	}
	
	@Override
	public void run (String...args) throws Exception {
		
		System.out.println("\nNet Salary: " + String.format("U$ %.2f", salaryService.netSalary(10000)));
		System.out.println("\nRich person Net Salary: " + String.format("U$ %.2f", salaryService.netSalaryRich(10000)));
		System.out.println("\nNet Salary: " + String.format("U$ %.2f", salaryService.netSalary(8000)));
	}

}
