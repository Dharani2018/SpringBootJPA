package com.dp.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.dp.entity.Doctor;
import com.dp.service.IDoctorService;

@Component("runner")
public class Runnercom implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		// get service class object
		IDoctorService service = ctx.getBean("doctorService", IDoctorService.class);

		/*try {
			//Create doctor class object
			Doctor doctor2 = new Doctor();
			doctor2.setDocName("rani");
			doctor2.setSpecialization("TSE");
			doctor2.setSalary(20000.00);
			Doctor doctor3 = new Doctor();
			doctor3.setDocName("raju");
			doctor3.setSpecialization("SE");
			doctor3.setSalary(200000.00);
			Doctor doctor1 = new Doctor();
			doctor1.setDocName("arnia");
			doctor1.setSpecialization("Manager");
			doctor1.setSalary(20000000.00);
			//invoke business method
			//String msg = service.registerDoctor(doctor1);
			//String msg = service.registerDoctorsGroup(Arrays.asList(doctor2,doctor1,doctor3));
			String msg = service.registerDoctorsGroup(List.of(new Doctor(null,"Varun","Professor",120000.00),new Doctor(null,"arun","SSE",120000.00),new Doctor(null,"tharun","SA",120000.00)));
			System.out.println("msg "+msg);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		// service.registerDoctor(new Doctor("dharani","gynacologist","200000"));
		/*try {
			Optional<Doctor> doc = service.findDoctor(1);
			System.out.println(doc);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		/*try {
			System.out.println(service.findDoctorCount());
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			System.out.println(service.existDoctorByID(105));
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Iterable<Doctor> docs = service.findAllDoctors();
			docs.forEach(System.out::println);
			//docs.forEach(d->System.out.println(d));
			//Arrays.asList(docs).stream().forEach(System.out::println);
			for(Doctor d : docs) {
				System.out.println(d);
			};
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Iterable<Doctor> list=service.findAllDoctorsByID(List.of(1000));
			list.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg = service.registerOrUpdateDoctor(new Doctor(252,"Varu","Dermatologis",100000.0));
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg = service.registerOrUpdateAll(List.of(new Doctor(202,"varu","professor",600000.0),new Doctor(300,"manu","neurologist",300000.0)));
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg = service.deleteDoctor(new Doctor(202,"varu","dermatologist",120000.0));
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg = service.deleteDoctorByID(252);
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg = service.deleteAllDoctors(List.of(new Doctor(53,"varu","",12.0), new Doctor(54, "asd", "", 159.0), new Doctor(444, "", "", 12.0)));
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg = service.deleteAllById(List.of(100,1,3,101));
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			String msg = service.deleteAll();
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
