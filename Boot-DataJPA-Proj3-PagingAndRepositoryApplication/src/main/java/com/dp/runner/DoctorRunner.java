package com.dp.runner;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.dp.entity.Doctor;
import com.dp.service.IPageService;
import com.dp.service.PageServiceImpl;
@Component("runner")
public class DoctorRunner implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx;
	
	@Override
	public void run(String... args) throws Exception {
		IPageService service = ctx.getBean("service", PageServiceImpl.class);
		/*try {
			service.findAllBySorting(true, "docName").forEach(d->System.out.println(d));
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findAllBySorting(true, "docId","docName").forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findAllPageable(true, "docId").forEach(System.out::println);;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		try {
			service.showAllData(true, "docId");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	}

}
