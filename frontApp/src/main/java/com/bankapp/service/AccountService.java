package com.bankapp.service;

import java.security.Principal;

import com.bankapp.domain.PrimaryAccount;
import com.bankapp.domain.SavingsAccount;


public interface AccountService {

	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	
	void deposit(String accountType, double amount, Principal principal);
	void withdraw(String accountType, double amount, Principal principal);
}
