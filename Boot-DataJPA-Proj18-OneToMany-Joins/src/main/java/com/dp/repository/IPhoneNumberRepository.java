package com.dp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dp.entity.PhoneNumbers;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumbers, Integer> {
	
	//@Query("SELECT c.regNo, c.mobileNo, c.provider, c.numType, p.pid, p.perName, p.perAddrs from PhoneNumbers c inner join persons p")
	//@Query("SELECT c.regNo, c.mobileNo, c.provider, c.numType, p.pid, p.perName, p.perAddrs from PhoneNumbers c right join persons p")
	//@Query("SELECT c.regNo, c.mobileNo, c.provider, c.numType, p.pid, p.perName, p.perAddrs from PhoneNumbers c inner join persons p")
	@Query("SELECT c.regNo, c.mobileNo, c.provider, c.numType, p.pid, p.perName, p.perAddrs from PhoneNumbers c outer join persons p")
	public List<Object[]> fetchDetailsFromChild();

}
