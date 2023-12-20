package com.dp.repo.offrs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dp.entity.offrs.Offers;

import jakarta.transaction.Transactional;

public interface IProdOffrsRepo extends JpaRepository<Offers, Integer> {
	
	@Query("UPDATE Offers SET offPercentage=:percentage WHERE pid=:pid")
	@Modifying
	public int updateProductsOfferInfo(Integer pid, Integer percentage);
}
