package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.Doctor;
import com.dp.repository.IJPArepo;
@Service("jpaService")
public class JpaServiceImpl implements IJpaService {
	
	@Autowired
	private IJPArepo repo;

	@Override
	public String deleteAllFindByID(List<Integer> ids) {
		List<Doctor> doc = repo.findAllById(ids);
		repo.deleteAllByIdInBatch(ids);
		return doc.size()+" no.of records were deleted.";
	}

}
