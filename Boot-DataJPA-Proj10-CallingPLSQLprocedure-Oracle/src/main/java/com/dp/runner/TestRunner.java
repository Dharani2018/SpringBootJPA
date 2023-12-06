package com.dp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.IDoctorService;
@Component("testRunner")
public class TestRunner implements CommandLineRunner {
	@Autowired
	IDoctorService service;

	@Override
	public void run(String... args) throws Exception {

		try {
			service.showDoctorsByIncomeRange(100000, 200000).forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
