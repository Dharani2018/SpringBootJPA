package com.dp.service;

import java.util.Date;

public interface IDoctorService {
	
	public Object getDoctorAllDetails();
	public int incrementSalary(String spec);
	public int deleteRecords(String spec);
	public int insertDoctor(String name, double income, String spec);
	public Date showDate();
	public int createTable();

}
