package com.evry.training.bank.service;

import com.evry.training.bank.dto.Ev_Account;

public interface Ev_AccountService {
	boolean addAccount(Ev_Account ev_Account);
	boolean deleteAccount(String accountId);
	Ev_Account viewAccount(String customerId);
}
