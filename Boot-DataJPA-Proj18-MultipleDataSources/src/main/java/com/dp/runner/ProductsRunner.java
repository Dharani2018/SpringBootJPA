package com.dp.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.entity.offrs.Offers;
import com.dp.entity.prod.Products;
import com.dp.service.IOffersService;
import com.dp.service.IProductsService;
@Component("runner")
public class ProductsRunner implements CommandLineRunner {
	@Autowired
	private IProductsService service;
	@Autowired
	private IOffersService offerService;
	
	@Override
	public void run(String... args) throws Exception {
		/*String msg = service.addProductDetails(List.of(new Products("Earbuds",18000.0f,true),
												new Products("Fridge", 55000.0f, true),
												new Products("AC", 20000.0f, true)));
		System.out.println(msg);
		String msg2 = service.addOffersDetails(List.of(new Offers("Cookker",20,40000.0f),
												new Offers("Stove", 50, 15000.0f),
												new Offers("Watches",60,72000.0f)));
		System.out.println(msg2);*/
		try {
			/*System.out.println(service.updateProduct(10002, false));
			System.out.println(offerService.updateProductOffers(1008, 10));*/
			offerService.findAllProducts().forEach(System.out::println);
			service.findAllProducts().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
