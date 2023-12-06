package com.dp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dp.entity.Doctor;

public interface IPageService {
	
	public Iterable<Doctor> findAllBySorting(Boolean direction, String col);
	public Iterable<Doctor> findAllBySorting(Boolean direction, String... cols);
	public Page<Doctor> findAllPageable(Boolean asc, String cols);
	public void showAllData(Boolean asc, String cols);

}
