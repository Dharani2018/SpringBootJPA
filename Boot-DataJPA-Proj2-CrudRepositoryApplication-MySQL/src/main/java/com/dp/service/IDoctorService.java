package com.dp.service;

import java.util.List;
import java.util.Optional;

import com.dp.entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor) throws Exception;
	public String registerDoctorsGroup(List<Doctor> doctor) throws Exception;
	public Optional<Doctor> findDoctor(Integer id);
	public long findDoctorCount();
	public boolean existDoctorByID(Integer Id);
	public Iterable<Doctor> findAllDoctors();
	public Iterable<Doctor> findAllDoctorsByID(Iterable<Integer> ids);
	public String registerOrUpdateDoctor(Doctor doctor);
	public String registerOrUpdateAll(List<Doctor> doctor);
	public String deleteDoctor(Doctor doc);
	public String deleteDoctorByID(Integer id);
	public String deleteAllDoctors(Iterable<Doctor> doctors);
	public String deleteAllById(Iterable<Integer> ids);
	public String deleteAll();
}
