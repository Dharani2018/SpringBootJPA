package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.repository.IStaticSclableRepository;
import com.dp.type.IDoctorType;
@Service("docService")
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IStaticSclableRepository repo;

	@Override
	public List<IDoctorType> getDoctorsBySpecialization(String str) {
		List<IDoctorType> docs = repo.findBySpecialization(str);
		return docs;
	}

	@Override
	public List<IDoctorType> getDoctorsBySpecializationAndSalary(String str, double start, double end) {
		
		
		return repo.findBySpecializationAndSalaryBetween(str, start, end);
	}
	
	

}
