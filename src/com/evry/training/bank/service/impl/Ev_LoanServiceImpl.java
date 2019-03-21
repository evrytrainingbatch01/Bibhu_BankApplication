package com.evry.training.bank.service.impl;

import com.evry.training.bank.domain.Ev_Loan;
import com.evry.training.bank.infra.Ev_LoanDAO;
import com.evry.training.bank.infra.impl.Ev_LoanDAOImpl;
import com.evry.training.bank.service.Ev_LoanService;

public class Ev_LoanServiceImpl implements Ev_LoanService{

	Ev_LoanDAO loanDAO=new Ev_LoanDAOImpl();
	@Override
	public Ev_Loan viewLoan(String loanId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateLoan(Ev_Loan ev_Loan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applyLoan(Ev_Loan ev_Loan) {
		// TODO Auto-generated method stub
		ev_Loan.setLoanId("BLR"+Math.round(Math.random()*1000));
		return loanDAO.applyLoan(ev_Loan);
	}
	
}
