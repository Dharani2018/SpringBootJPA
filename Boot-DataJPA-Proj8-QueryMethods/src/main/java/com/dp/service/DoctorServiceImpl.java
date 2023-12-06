package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.Doctor;
import com.dp.repository.IHqlRepository;

@Service("docServ")
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IHqlRepository repo;

	@Override
	public List<Doctor> getDoctorsListbyIncome(double start, double end) {
		return repo.getDoctorsBySalaryRange(start, end);
	}

	@Override
	public List<String> getDoctorNames(double start, double end) {
		return repo.getDoctorNames(start, end);
	}

	@Override
	public List<Object[]> getDoctorDetails(double start, double end) {
		return repo.getDoctorsDetails(start, end);
	}

}
