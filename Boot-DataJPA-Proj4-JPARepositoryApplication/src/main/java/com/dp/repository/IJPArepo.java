package com.dp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dp.entity.Doctor;

public interface IJPArepo extends JpaRepository<Doctor, Integer> {

}
