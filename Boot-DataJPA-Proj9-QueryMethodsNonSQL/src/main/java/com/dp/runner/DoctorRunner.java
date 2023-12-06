package com.dp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.IDoctorService;
@Component
public class DoctorRunner implements CommandLineRunner {
	@Autowired
	private IDoctorService service;
	
	@Override
	public void run(String... args) throws Exception {
		/*try {
			Object[] row = (Object[])service.getDoctorAllDetails();
			for(Object ele : row) {
				System.out.println(ele);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			System.out.println(service.incrementSalary("gynacologist"));
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			System.out.println(service.deleteRecords("Admin"));
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			System.out.println(service.insertDoctor("Dharani", 300000.0,  "Dermotologist"));
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			System.out.println(service.showDate());
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			System.out.println(service.createTable());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
