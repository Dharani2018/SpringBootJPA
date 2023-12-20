package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.offrs.Offers;
import com.dp.entity.prod.Products;
import com.dp.repo.offrs.IProdOffrsRepo;
import com.dp.repo.prod.IProdRepo;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service("service")
@org.springframework.transaction.annotation.Transactional(transactionManager = "oraTxMgmr")
public class ProductsServiceImpl implements IProductsService {
	
	@Autowired
	private IProdRepo prodRepo;
	
	

	@Override
	public String addProductDetails(List<Products> prods) {
		//Optional<Products> p = prodRepo.save(prods);
		prodRepo.saveAll(prods);
		return "All product details were saved.";
	}

	@Override
	public String updateProduct(Integer pid, Boolean avail) {
		int count = prodRepo.updateProductInfo(pid, avail);
		return count+" Products are updated."; 
	}
	
	public List<Products> findAllProducts(){
		return prodRepo.findAll();
	}

	
}
