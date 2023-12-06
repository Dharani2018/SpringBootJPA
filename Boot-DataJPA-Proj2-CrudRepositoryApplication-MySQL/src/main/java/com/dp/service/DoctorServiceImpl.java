package com.dp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.Doctor;
import com.dp.repository.IDoctorRepository;

@Service("doctorService")
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository repo;

	@Override
	public String registerDoctor(Doctor doctor) throws Exception {
		if(doctor==null) {
			return "no operation can be performed.";
		}else {
			System.out.println("in else");
			Doctor doc = repo.save(doctor);
			return "the total "+doc.getDocId()+ " records are inserted";
		}
		
	}

	@Override
	public String registerDoctorsGroup(List<Doctor> doctor) throws Exception {
		if(doctor!=null) {
			List<Doctor> doctors = (List<Doctor>) repo.saveAll(doctor);
			//List<Integer> dlist = new ArrayList<Integer>();
			
			List<Integer> dlist = doctors.stream().map(d->d.getDocId()).toList();
			
			//doctors.forEach(d->dlist.add(d.getDocId()));
			return dlist+ " no of doctors are added as a group";
		}
		return "could not complete the operation";
	}

	@Override
	public Optional<Doctor> findDoctor(Integer id) {
		return repo.findById(id);
	}

	@Override
	public long findDoctorCount() {
		long count = repo.count();
		return count;
	}

	@Override
	public boolean existDoctorByID(Integer Id) {
		return repo.existsById(Id);
	}

	@Override
	public Iterable<Doctor> findAllDoctors() {
		Iterable<Doctor> docs = repo.findAll();
		//docs.forEach(d->System.out.println(d));
		return docs;
	}

	@Override
	public Iterable<Doctor> findAllDoctorsByID(Iterable<Integer> ids) {
		Iterable<Doctor> list = repo.findAllById(ids);
		return list;
	}

	@Override
	public String registerOrUpdateDoctor(Doctor doctor) {
		//Doctor doc1 = findDoctor(doctor.getDocId()).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		Optional<Doctor> doc = findDoctor(doctor.getDocId());
		if(doc.isPresent()) {
			Doctor dc = repo.save(doctor);
			return "Record has updated";
		}else {
			Doctor dc = repo.save(doctor);
			return "record has inserted with"+dc.getDocId();
		}
		
	}

	@Override
	public String registerOrUpdateAll(List<Doctor> doctor) {
		Iterable<Doctor> docs = repo.saveAll(doctor);
		
				
		return "all records have been updated";
	}

	@Override
	public String deleteDoctor(Doctor doc) {
		Optional<Doctor> doctor = findDoctor(doc.getDocId());
		if(doctor.isPresent()) {
			repo.delete(doc);
			return "given"+doc.getDocId()+" record has been deleted";
		}else {
			return "record not found";
		}
	}

	@Override
	public String deleteDoctorByID(Integer id) {
		findDoctor(id).orElseThrow(()->new IllegalArgumentException("record not found with this ID "+id));
		Optional< Doctor> doctor = findDoctor(id);
		if(doctor.isPresent()) {
			repo.deleteById(id);
			return "given "+id+" doctor has been deleted.";
		}else {
			return "given "+id+ "doctor has not found.";
		}
	}

	@Override
	public String deleteAllDoctors(Iterable<Doctor> doctors) {
		ArrayList< Integer> list = new ArrayList<Integer>();
		for(Doctor d: doctors) {
			Optional<Doctor> doc = repo.findById(d.getDocId());
			if(doc.isPresent()) {
			  list.add(d.getDocId());
			}
		}
		int count = list.size();
		repo.deleteAll(doctors);
		return count+" no. of records were deleted having id's "+list;
	}

	@Override
	public String deleteAllById(Iterable<Integer> ids) {
		List<Doctor> doc= (List<Doctor>)repo.findAllById(ids);
		
		repo.deleteAllById(ids);
		return doc.size()+" no of records are deleted ";
	}

	@Override
	public String deleteAll() {
		repo.deleteAll();
		return "all records have been deleted";
	}

	

}
