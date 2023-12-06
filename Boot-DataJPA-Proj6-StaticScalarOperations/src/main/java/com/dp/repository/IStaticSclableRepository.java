package com.dp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dp.entity.Doctor;
import com.dp.type.IDoctorType;

public interface IStaticSclableRepository extends JpaRepository<Doctor, Integer>{
	
	public List<IDoctorType> findBySpecialization(String str);
	public List<IDoctorType> findBySpecializationAndSalaryBetween(String str,double start,double end);
}
