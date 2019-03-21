package com.evry.training.bank.infra;

import com.evry.training.bank.domain.Ev_Account;

public interface Ev_AccountDAO {
	boolean addAccount(Ev_Account ev_Account);
	boolean deleteAccount(String accountId);
	Ev_Account viewAccount(String customerId);
}
