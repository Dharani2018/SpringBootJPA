package com.dp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dp.entity.Doctor;
import com.dp.type.IView;

public interface IDynamicScalarRepository extends JpaRepository<Doctor, Integer> {
	
	public <T extends IView> List<T> findBySalaryBetween(double start, double end, Class<T> clazz);

}
