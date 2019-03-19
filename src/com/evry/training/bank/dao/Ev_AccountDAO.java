package com.evry.training.bank.dao;

import com.evry.training.bank.dto.Ev_Account;

public interface Ev_AccountDAO {
	boolean addAccount(Ev_Account ev_Account);
	boolean deleteAccount(String accountId);
}
