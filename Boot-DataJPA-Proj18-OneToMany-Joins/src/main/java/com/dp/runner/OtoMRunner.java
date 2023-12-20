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
			service.fetchCommonRecordsUsingChild().forEach(record->{
				for(Object obj : record) {
					System.out.print(obj+" ");
				}
				System.out.println();
			});
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
