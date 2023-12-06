package com.dp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dp.entity.Doctor;

public interface IHqlRepository extends JpaRepository<Doctor, Integer> {
	
	//positional params
	//@Query("from doctor where salary<=? and salary >=?")---JDBC style parameters are not supported in JPA
	//ordinal positional params
	//@Query("from Doctor where salary>=?1 and salary<=?2")
	//@Query("from Doctor where salary>=:initial and salary<=:final order by docName")----named parameters with Param
	@Query("from Doctor where salary>=:start and salary<=:end")
	public List<Doctor> getDoctorsBySalaryRange(double start,double end);
	
	//selecting only one column
	@Query("select docName from Doctor where salary>=:start and salary<=:end")
	public List<String> getDoctorNames(double start,double end);
	
	//selecting multiple columns
	@Query("select docName,specialization from Doctor where salary>=:start and salary<=:end")
	public List<Object[]> getDoctorsDetails(double start, double end);
	
	
	

}
