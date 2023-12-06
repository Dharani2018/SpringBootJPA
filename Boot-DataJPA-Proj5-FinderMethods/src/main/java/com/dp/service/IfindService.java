package com.dp.service;

import java.util.List;

import com.dp.entity.Doctor;

public interface IfindService {
	
	public List<Doctor> findDoctorWithName(String name);
	public List<Doctor> findDoctorWithNameIs(String name);
	public List<Doctor> findDoctorWithNameEquals(String name);
	public List<Doctor> findDoctorWithNameHaving(String name);
	public List<Doctor> findDoctorWithNameHas(String name);
	public List<Doctor> findDoctorIsStartingWith(String name);
	public List<Doctor> findDoctorIsEndingWith(String name);
	public List<Doctor> findDoctorIsLike(String name);
	public List<Doctor> findDoctorIsNotLike(String name);
	public List<Doctor> findDoctorSalaryGreaterthan(double salary);
	public List<Doctor> findDoctorSalaryBetweenRangeAndSpecializationIs(double start, double end, String specialization);
	public List<Doctor> findDoctorBySpecialization(List<String> specs);
}
