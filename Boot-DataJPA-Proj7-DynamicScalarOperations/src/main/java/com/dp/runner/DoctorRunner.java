package com.dp.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.DoctorServiceImpl;
import com.dp.type.IResultView1;
import com.dp.type.IResultView2;
@Component("runner")
public class DoctorRunner implements CommandLineRunner {
	@Autowired
	private DoctorServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			List<IResultView1> list = service.getDoctorsBySalary(70000, 100000, IResultView1.class);
			list.forEach(d->{
				System.out.println(d.getDocName()+"--------"+d.getSpecialization());
			});
			
			List<IResultView2> list2 = service.getDoctorsBySalary(70000, 100000, IResultView2.class);
			list2.forEach(d->{
				System.out.println(d.getDocName()+"--------"+d.getSpecialization()+"---------"+d.getSalary());
			});
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
