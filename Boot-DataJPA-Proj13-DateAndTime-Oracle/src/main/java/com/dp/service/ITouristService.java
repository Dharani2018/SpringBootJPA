package com.dp.service;

import com.dp.entity.Tourist;

public interface ITouristService {
	
	public Tourist saveTourist(Tourist t);
	public String getTouristAge(String name);

}
