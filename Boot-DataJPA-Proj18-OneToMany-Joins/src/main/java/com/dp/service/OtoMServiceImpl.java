package com.dp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.repository.IPersonRepository;
import com.dp.repository.IPhoneNumberRepository;
@Service("service")
public class OtoMServiceImpl implements IOtoMService {
	
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;
	
	@Override
	public List<Object[]> fetchCommonRecords() {
		return personRepo.fetchDataUsingJoins();
	}

	@Override
	public List<Object[]> fetchCommonRecordsUsingChild() {
		return phoneRepo.fetchDetailsFromChild();
	}

}
