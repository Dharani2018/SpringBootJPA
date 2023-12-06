package com.dp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dp.entity.Doctor;

public interface IFinderMethodsRepository extends JpaRepository<Doctor, Integer>{
	public List<Doctor> findBydocName(String name);
	public List<Doctor> findBydocNameIs(String name);
	public List<Doctor> findBydocNameEquals(String name);
	public List<Doctor> findBydocNameContaining(String name);
	public List<Doctor> findBydocNameContains(String name);
	public List<Doctor> findBydocNameStartingWith(String name);
	public List<Doctor> findBydocNameEndingWith(String name);
	public List<Doctor> findBydocNameLike(String name);
	public List<Doctor> findBydocNameNotLike(String name);
	public List<Doctor> findBysalaryGreaterThan(double salary);
	public List<Doctor> findBysalaryBetweenAndSpecializationEquals(double start, double end, String specialization);
	public List<Doctor> findBySpecializationIn(List<String> specs);
}
