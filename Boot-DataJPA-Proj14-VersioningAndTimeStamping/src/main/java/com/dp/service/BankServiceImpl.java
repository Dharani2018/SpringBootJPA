package com.dp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.BankAccount;
import com.dp.repository.IRepository;
@Service("bsi")
public class BankServiceImpl implements IBankService {
	@Autowired
	private IRepository repo;

	@Override
	public String createBankAcct(BankAccount ba) {
		BankAccount act = repo.save(ba);
		return "account with account number "+act.getAcctNum()+" has created";
	}

	@Override
	public String creditAmt(Long actno, Long amt) {
		Optional<BankAccount> acct = repo.findById(actno);
		if(acct.isPresent()) {
			long prevAmt = acct.get().getBalance();
			acct.get().setBalance(amt+prevAmt);
			repo.save(acct.get());
			return "amount has credited into account "+actno;
		}
		else {
			return "account has not found with account number "+actno;
		}
		
	}

	@Override
	public String debitAmt(Long actno, Long amt) {
		Optional<BankAccount> acct = repo.findById(actno);
		if(acct.isPresent()) {
			long prevAmt = acct.get().getBalance();
			acct.get().setBalance(prevAmt-amt);
			repo.save(acct.get());
			return "amount has debited into account "+actno;
		}
		else {
			return "account has not found with account number "+actno;
		}
	}

}
