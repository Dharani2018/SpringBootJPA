package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service("docService")
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private EntityManager manager;

	@Override
	public List<Doctor> showAllDoctorsByIncome(double startIncome, double endIncome) {
		//call stored procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_INCOME_RANGE",Doctor.class);
		//register the parameters and its mode
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		//set query params
		query.setParameter(1, startIncome);
		query.setParameter(2, endIncome);
		
		return query.getResultList();
	}

}
