package com.evry.training.bank.service.impl;

import com.evry.training.bank.dao.Ev_AccountDAO;
import com.evry.training.bank.dao.impl.Ev_AccountDAOImpl;
import com.evry.training.bank.dto.Ev_Account;
import com.evry.training.bank.service.Ev_AccountService;

public class Ev_AccountServiceImpl implements Ev_AccountService{

	Ev_AccountDAO accountDAO=new Ev_AccountDAOImpl();
	@Override
	public boolean addAccount(Ev_Account ev_Account) {
		return accountDAO.addAccount(ev_Account);
	}

	@Override
	public boolean deleteAccount(String accountId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ev_Account viewAccount(String customerId) {
		// TODO Auto-generated method stub
		return accountDAO.viewAccount(customerId);
	}

}
