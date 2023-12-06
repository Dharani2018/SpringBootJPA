package com.dp.service;

import java.util.List;

import com.dp.type.IView;

public interface IDoctorService {
	
	public <T extends IView> List<T> getDoctorsBySalary(double start, double end, Class<T> clazz);

}
