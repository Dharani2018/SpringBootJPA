package com.dp.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.dp.service.IJpaService;
import com.dp.service.JpaServiceImpl;
@Component("runner")
public class JpaRunner implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		IJpaService service = ctx.getBean("jpaService", JpaServiceImpl.class);
		try {
			System.out.println(service.deleteAllFindByID(List.of(1, 2, 5, 52)));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
