package com.dp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.dp.entity.Doctor;

public interface IPageRepository extends PagingAndSortingRepository<Doctor, Integer>, CrudRepository<Doctor, Integer> {

}
