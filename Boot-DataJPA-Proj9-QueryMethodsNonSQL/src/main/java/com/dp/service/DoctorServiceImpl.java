package com.dp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dp.repository.IRepository;

@Service("docService")
@Transactional
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IRepository repo;

	@Override
	public Object getDoctorAllDetails() {
		
		return repo.getAllDetails();
	}

	@Override
	public int incrementSalary(String spec) {
		return repo.updateSalary(spec);
	}

	@Override
	public int deleteRecords(String spec) {
		return repo.deleteMembers(spec);
	}

	@Override
	public int insertDoctor(String name, double income, String spec) {
		return repo.insertDoctor(name, income, spec);
	}

	@Override
	public Date showDate() {
		return repo.shoeSystemDate();
	}

	@Override
	public int createTable() {
		return repo.createTable();
	}
	

}
