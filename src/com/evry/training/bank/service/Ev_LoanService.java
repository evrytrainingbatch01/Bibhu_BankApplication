package com.evry.training.bank.service;

import com.evry.training.bank.dto.Ev_Loan;

public interface Ev_LoanService {
	Ev_Loan viewLoan(String loanId);
	boolean updateLoan(Ev_Loan ev_Loan);
	boolean applyLoan(Ev_Loan ev_Loan);
}
