package com.dp.repo.prod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dp.entity.prod.Products;

import jakarta.transaction.Transactional;

public interface IProdRepo extends JpaRepository<Products, Integer> {
	
	@Modifying
	@Query("UPDATE Products SET availability=:availability WHERE pid=:pid")
	public int updateProductInfo(Integer pid, Boolean availability);

}
