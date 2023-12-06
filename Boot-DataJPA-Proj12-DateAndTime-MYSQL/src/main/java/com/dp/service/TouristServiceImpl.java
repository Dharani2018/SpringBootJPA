package com.dp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.Tourist;
import com.dp.repository.IRepository;
@Service("touristService")
public class TouristServiceImpl implements ITouristService {
	@Autowired
	private IRepository repo;

	@Override
	public Tourist saveTourist(Tourist t) {
		Tourist tt=repo.save(t);
		return tt;
	
	}

	@Override
	public String getTouristAge(String name) {
		int age = repo.getTouristAge(name);
		return "Tourist "+name+" age is "+age;
	}

}
