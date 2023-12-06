package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.repository.IDynamicScalarRepository;
import com.dp.type.IView;
@Service("doctorService")
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDynamicScalarRepository repo;

	@Override
	public <T extends IView> List<T> getDoctorsBySalary(double start, double end, Class<T> clazz) {
		return repo.findBySalaryBetween(start, end, clazz);
	}

}
