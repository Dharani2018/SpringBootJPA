package com.dp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.IDoctorService;
@Component("runner")
public class DoctorTypeInterfaceRunner implements CommandLineRunner {
	
	@Autowired
	private IDoctorService service;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			service.getDoctorsBySpecialization("gynacologist").forEach(d->{
				System.out.println(d.getDocName()+".........."+d.getSpecialization());			
			}
			);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			service.getDoctorsBySpecializationAndSalary("professor", 150000, 300000).forEach(d->System.out.println(d.getDocName()+"......."+d.getSpecialization()));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
