package com.dp.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dp.entity.Doctor;

public interface IRepository extends JpaRepository<Doctor, Integer> {
	
	@Query("select count(*), max(salary), min(salary) from Doctor")
	public Object getAllDetails();
	
	@Query("update Doctor set salary=0.10*salary+salary where specialization=:spec")
	@Modifying
	public int updateSalary(String spec);
	
	@Query("delete from Doctor where specialization=:spec")
	@Modifying
	public int deleteMembers(String spec);
	
	@Query(value = "INSERT INTO DOCTOR_JPA VALUES (DOC_SEQ.NEXTVAL,:name,:income,:spec)", nativeQuery = true)
	@Modifying
	public int insertDoctor(String name, double income, String spec);
	
	@Query(value = "SELECT SYSDATE FROM DUAL", nativeQuery = true)
	public Date shoeSystemDate();
	
	@Query(value = "CREATE TABLE STUDENT_NITS (SNO NUMBER,SNAME VARCHAR2(30), SMARKS NUMBER)", nativeQuery = true)
	@Modifying
	public int createTable();
	

}
