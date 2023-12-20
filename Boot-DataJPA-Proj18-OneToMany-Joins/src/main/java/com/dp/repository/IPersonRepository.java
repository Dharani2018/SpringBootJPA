package com.dp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dp.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
	
	//@Query("SELECT p.pid, p.perName, p.perAddrs, c.regNo, c.mobileNo, c.provider, c.numType from Person p inner join contactDetails c")
	//@Query("SELECT p.pid, p.perName, p.perAddrs, c.regNo, c.mobileNo, c.provider, c.numType from Person p left join contactDetails c")
	//@Query("SELECT p.pid, p.perName, p.perAddrs, c.regNo, c.mobileNo, c.provider, c.numType from Person p right join contactDetails c")
	@Query("SELECT p.pid, p.perName, p.perAddrs, c.regNo, c.mobileNo, c.provider, c.numType from Person p outer join contactDetails c")
	public List<Object[]> fetchDataUsingJoins();

}
