package com.dp.service;

import java.util.List;

import com.dp.type.IDoctorType;

public interface IDoctorService {
	
	public List<IDoctorType> getDoctorsBySpecialization(String str);
	public List<IDoctorType> getDoctorsBySpecializationAndSalary(String str,double start,double end);

}
