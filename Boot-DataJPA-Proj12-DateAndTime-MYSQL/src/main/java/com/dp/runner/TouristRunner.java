package com.dp.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.entity.Tourist;
import com.dp.service.ITouristService;
@Component("runner")
public class TouristRunner implements CommandLineRunner {
	@Autowired
	private ITouristService service;

	@Override
	public void run(String... args) throws Exception {
		//Tourist t = new Tourist("Dharani","coorg",LocalDateTime.of(1996, 07, 29, 10, 35),LocalDate.now(),LocalTime.now());
		/*try {
			Tourist t=service.saveTourist(new Tourist("Dharani","coorg",LocalDateTime.of(1996, 07, 29, 10, 35),LocalDate.now(),LocalTime.now()));
			System.out.println(t);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			System.out.println(service.getTouristAge("Dharani"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
