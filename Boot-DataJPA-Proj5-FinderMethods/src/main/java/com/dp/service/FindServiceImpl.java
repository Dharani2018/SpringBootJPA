package com.dp.service;

import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.Doctor;
import com.dp.repository.IFinderMethodsRepository;
@Service("finderService")
public class FindServiceImpl implements IfindService {
	@Autowired
	private IFinderMethodsRepository repo;
	
	@Override
	public List<Doctor> findDoctorWithName(String name) {
		List<Doctor> docs =repo.findBydocName(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorWithNameIs(String name) {
		List<Doctor> docs =repo.findBydocNameIs(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorWithNameEquals(String name) {
		List<Doctor> docs = repo.findBydocNameEquals(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorWithNameHaving(String name) {
		List<Doctor> docs = repo.findBydocNameContaining(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorWithNameHas(String name) {
		List<Doctor> docs = repo.findBydocNameContains(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorIsStartingWith(String name) {
		List<Doctor> docs = repo.findBydocNameStartingWith(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorIsEndingWith(String name) {
		List<Doctor> docs = repo.findBydocNameEndingWith(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorIsLike(String name) {
		List<Doctor> docs = repo.findBydocNameLike(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorIsNotLike(String name) {
		List<Doctor> docs = repo.findBydocNameNotLike(name);
		return docs;
	}

	@Override
	public List<Doctor> findDoctorSalaryGreaterthan(double salary) {
		return repo.findBysalaryGreaterThan(salary);
	}

	@Override
	public List<Doctor> findDoctorSalaryBetweenRangeAndSpecializationIs(double start, double end,
			String specialization) {
		return repo.findBysalaryBetweenAndSpecializationEquals(start, end, specialization);
	}

	@Override
	public List<Doctor> findDoctorBySpecialization(List<String> specs) {
		return repo.findBySpecializationIn(specs);
	}

}
