package com.dp.service;

import java.util.List;

import com.dp.entity.offrs.Offers;
import com.dp.entity.prod.Products;

public interface IProductsService {
	
	public String addProductDetails(List<Products> prods);
	public String updateProduct(Integer pid, Boolean avail);
	public List<Products> findAllProducts();

}
