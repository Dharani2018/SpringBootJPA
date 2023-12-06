package com.dp.repository;

import org.springframework.data.repository.CrudRepository;

import com.dp.entity.Doctor;

public interface IDoctorRepository extends CrudRepository<Doctor, Integer>{

}
