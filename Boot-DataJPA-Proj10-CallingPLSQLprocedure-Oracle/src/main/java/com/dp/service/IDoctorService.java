package com.dp.service;

import java.util.List;

import com.dp.entity.Doctor;

public interface IDoctorService {
	public List<Doctor> showDoctorsByIncomeRange(float startIncome, float endIncome);

}
