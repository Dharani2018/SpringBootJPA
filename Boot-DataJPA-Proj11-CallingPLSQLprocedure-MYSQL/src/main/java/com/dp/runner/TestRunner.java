package com.dp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.IDoctorService;
@Component("runner")
public class TestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			service.showAllDoctorsByIncome(150000, 200000).forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
