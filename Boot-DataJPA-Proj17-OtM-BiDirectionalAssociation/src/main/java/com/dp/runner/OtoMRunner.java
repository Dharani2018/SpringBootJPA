package com.dp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.IOtoMService;
@Component("runner")
public class OtoMRunner implements CommandLineRunner {
	@Autowired
	private IOtoMService service;
	
	@Override
	public void run(String... args) throws Exception {

		try {
			//System.out.println(service.saveParent());
			//System.out.println(service.saveChild());
			//service.findAllPersonDetails();
			//service.findAllChildDetails();
			//service.deleteChildRecords(121);
			//service.addOnlyPhoneNumbers(120);
			service.deleteParticularChild(122, 7306785226l);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
