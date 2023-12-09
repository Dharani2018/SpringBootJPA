package com.dp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dp.entity.PhoneNumbers;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumbers, Integer> {

}
