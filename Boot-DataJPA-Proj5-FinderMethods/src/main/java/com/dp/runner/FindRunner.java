package com.dp.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.service.IfindService;
@Component("runner")
public class FindRunner implements CommandLineRunner {
	@Autowired
	private IfindService service;
	@Override
	public void run(String... args) throws Exception {
		/*try {
			service.findDoctorWithName("Varnika").forEach(System.out::println);
		}  catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorWithNameIs("Gnani").forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorWithNameEquals("Varnika").forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorWithNameHaving("ni").forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorWithNameHas("Gna").forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorIsStartingWith("Va").forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorIsEndingWith("ni").forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorIsLike("%V%").forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorIsNotLike("%V%").forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorSalaryGreaterthan(50000.0).forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			service.findDoctorSalaryBetweenRangeAndSpecializationIs(150000.0, 200000.0, "gynacologist").forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			service.findDoctorBySpecialization(List.of("Admin", "Govt", "professor")).forEach(System.out::println);;
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
