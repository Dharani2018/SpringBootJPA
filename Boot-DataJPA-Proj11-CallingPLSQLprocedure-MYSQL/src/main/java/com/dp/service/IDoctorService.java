package com.dp.service;

import java.util.List;

import com.dp.entity.Doctor;

public interface IDoctorService {
	
	public List<Doctor> showAllDoctorsByIncome(double startIncome, double endIncome);

}
