package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import com.dp.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service("docService")
public class DoctorService implements IDoctorService {
	@Autowired
	private EntityManager manager;

	@Override
	public List<Doctor> showDoctorsByIncomeRange(float startIncome, float endIncome) {
		//create StoredProcedureQuery object pointing to PL/SQL procedure
		StoredProcedureQuery procedure = manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_INCOME_RANGE",Doctor.class);
		//register both IN and OUT parameters by specifying their mode
		procedure.registerStoredProcedureParameter(1, Float.class, ParameterMode.IN);
		procedure.registerStoredProcedureParameter(2, Float.class, ParameterMode.IN);
		procedure.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		
		//set values to IN params
		procedure.setParameter(1, startIncome);
		procedure.setParameter(2, endIncome);
		//cal PL/SQL procedure
		List<Doctor> list = procedure.getResultList();
		return list;
	}

}
