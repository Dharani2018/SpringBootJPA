package com.dp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.dp.entity.Doctor;
import com.dp.repository.IPageRepository;
@Service("service")
public class PageServiceImpl implements IPageService {
	@Autowired
	private IPageRepository pageRepo;

	@Override
	public Iterable<Doctor> findAllBySorting(Boolean asc, String col) {
		//creating SORT object
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, col);
		//Calling repo
		Iterable<Doctor> docs = pageRepo.findAll(sort);
		return docs;
	}

	@Override
	public Iterable<Doctor> findAllBySorting(Boolean asc, String... cols) {
		//Prepare sort object
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, cols);
		Iterable<Doctor> docs = pageRepo.findAll(sort);
		return docs;
	}

	@Override
	public Page<Doctor> findAllPageable(Boolean asc, String cols) {
		
		//Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, cols);
		//create pageable object
		//Pageable pg = PageRequest.of(1, 3, asc?Direction.ASC:Direction.DESC, cols);
		//use repo
		Page<Doctor> p1 = pageRepo.findAll(PageRequest.of(1, 3, asc?Direction.ASC:Direction.DESC, cols));
		/*long count= pageRepo.count();
		long pageCnt = count/3;
		if(count%pageCnt!=0)
			pageCnt++;
		
		for(int i=0;i<pageCnt;i++) {
			Pageable pg = PageRequest.of(i, 3, asc?Direction.ASC:Direction.DESC, cols);
			Page<Doctor> page = pageRepo.findAll(pg);
			page.getContent().forEach(System.out::println);
			System.out.println("----------------------------------------");*/
		//}
		//Page<Doctor> p1 = pageRepo.findAll(PageRequest.of(0, 3, sort));
		
		return p1;
	}
	
	@Override
	public void showAllData(Boolean asc, String cols) {
		
		//Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, cols);
		//create pageable object
		//Pageable pg = PageRequest.of(1, 3, asc?Direction.ASC:Direction.DESC, cols);
		//use repo
		//Page<Doctor> p1 = pageRepo.findAll(PageRequest.of(1, 3, asc?Direction.ASC:Direction.DESC, cols));
		long count= pageRepo.count();
		long pageCnt = count/3;
		if(count%pageCnt!=0)
			pageCnt++;
		
		for(int i=0;i<pageCnt;i++) {
			System.out.println("----------------------------------------");
			Pageable pg = PageRequest.of(i, 3, asc?Direction.ASC:Direction.DESC, cols);
			Page<Doctor> page = pageRepo.findAll(pg);
			page.getContent().forEach(System.out::println);
			//System.out.println("----------------------------------------");
		}
		//Page<Doctor> p1 = pageRepo.findAll(PageRequest.of(0, 3, sort));
		
	}

	
}
