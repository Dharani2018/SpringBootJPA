package com.dp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dp.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
