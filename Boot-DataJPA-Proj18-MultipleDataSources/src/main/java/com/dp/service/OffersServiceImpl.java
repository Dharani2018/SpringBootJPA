package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dp.entity.offrs.Offers;
import com.dp.entity.prod.Products;
import com.dp.repo.offrs.IProdOffrsRepo;
import com.dp.repo.prod.IProdRepo;
@Service("offersService")
@Transactional(transactionManager = "msTxMgmr")
public class OffersServiceImpl implements IOffersService {

	@Autowired
	private IProdOffrsRepo offRepo;
	


	@Override
	public String addOffersDetails(List<Offers> offs) {
		offRepo.saveAll(offs);
		return "All products related offers details were saved.";
	}



	@Override
	public String updateProductOffers(Integer pid, Integer percentage) {
		int count = offRepo.updateProductsOfferInfo(pid, percentage);
		return count+" products are updated.";
	}



	@Override
	public List<Offers> findAllProducts() {
		List<Offers> prods = offRepo.findAll();
		return prods;
	}


}
