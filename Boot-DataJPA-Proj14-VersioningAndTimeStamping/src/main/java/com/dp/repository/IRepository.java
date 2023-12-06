package com.dp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.dp.entity.BankAccount;

public interface IRepository extends CrudRepository<BankAccount, Long>, JpaRepository<BankAccount, Long> {
	
	public BankAccount findByacctNum(Long acctno);

}
