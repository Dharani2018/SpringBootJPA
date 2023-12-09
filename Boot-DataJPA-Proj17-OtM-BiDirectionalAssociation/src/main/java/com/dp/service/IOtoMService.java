package com.dp.service;

import java.util.List;
import java.util.Map;

import com.dp.entity.Person;
import com.dp.entity.PhoneNumbers;

public interface IOtoMService {
	
	public String saveParent();
	public String saveChild();
	public void findAllPersonDetails();
	public void findAllChildDetails();
	public String deleteChildRecords(Integer id);
	public String addOnlyPhoneNumbers(Integer id);
	public String deleteParticularChild(Integer id, Long pno);

}
