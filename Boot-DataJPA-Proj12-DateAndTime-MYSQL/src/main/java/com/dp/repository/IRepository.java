package com.dp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dp.entity.Tourist;

public interface IRepository extends CrudRepository<Tourist, Integer>, JpaRepository<Tourist, Integer> {
	@Query(value = "SELECT YEAR(CURRENT_TIMESTAMP)-YEAR(DOB) FROM TOURIST WHERE NAME=:name", nativeQuery = true)
	public Integer getTouristAge(String name);

}
