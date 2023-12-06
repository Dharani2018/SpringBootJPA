package com.dp.service;

import com.dp.entity.BankAccount;

public interface IBankService {
	
	public String createBankAcct(BankAccount ba);
	public String creditAmt(Long actno, Long amt);
	public String debitAmt(Long actno, Long amt);

}
