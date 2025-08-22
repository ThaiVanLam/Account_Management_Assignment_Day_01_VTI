package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Account;
import com.vti.repository.IAccountRepository;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private IAccountRepository accountRepository;

	@Override
	public List<Account> getAllAccounts() {
		return accountRepository.getAllAccounts();
	}

	@Override
	public Account getAccountById(int id) {
		return accountRepository.getAccountById(id);
	}

	@Override
	public void createAccount(Account account) {
		accountRepository.createAccount(account);
	}

	@Override
	public void updateAccount(Account account) {
		accountRepository.updateAccount(account);
	}

	@Override
	public void deleteAccount(int id) {
		accountRepository.deleteAccount(id);
	}

}
