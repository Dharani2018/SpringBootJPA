package com.dp.service;

import java.util.List;

import com.dp.entity.Doctor;

public interface IDoctorService {
	
	public List<Doctor> getDoctorsListbyIncome(double start, double end);
	public List<String> getDoctorNames(double start, double end);
	public List<Object[]> getDoctorDetails(double start, double end);

}
