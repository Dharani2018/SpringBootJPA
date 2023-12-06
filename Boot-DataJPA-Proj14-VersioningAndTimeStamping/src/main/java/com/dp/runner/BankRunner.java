package com.dp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.entity.BankAccount;
import com.dp.service.IBankService;

@Component("runner")
public class BankRunner implements CommandLineRunner {
	@Autowired
	private IBankService service;
	@Override
	public void run(String... args) throws Exception {
		try {
			service.createBankAcct(new BankAccount("Gnani", 6200000L));
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			service.creditAmt(1000001l, 1000L);
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			service.debitAmt(1000000l, 10000L);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
