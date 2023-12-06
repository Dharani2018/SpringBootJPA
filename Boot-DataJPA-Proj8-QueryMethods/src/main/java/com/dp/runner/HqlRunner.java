package com.dp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.IDoctorService;
@Component("runner")
public class HqlRunner implements CommandLineRunner {
	@Autowired
	public IDoctorService service;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			service.getDoctorsListbyIncome(100000.0, 150000.0).forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.getDoctorNames(100000.0, 150000.0).forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			service.getDoctorDetails(70000, 90000).forEach(obj->{
				for(Object s:obj) {
					System.out.print(s+"    ");
				}
			});
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
