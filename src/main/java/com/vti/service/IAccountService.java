package com.vti.service;

import java.util.List;

import com.vti.entity.Account;

public interface IAccountService {

	List<Account> getAllAccounts();

	Account getAccountById(int id);

	void createAccount(Account account);

	void updateAccount(Account account);

	void deleteAccount(int id);

}
