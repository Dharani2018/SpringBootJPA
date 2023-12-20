package com.dp.service;

import java.util.List;

import com.dp.entity.offrs.Offers;

public interface IOffersService {
	public String addOffersDetails(List<Offers> offs);
	public String updateProductOffers(Integer pid, Integer percentage);
	public List<Offers> findAllProducts();

}
