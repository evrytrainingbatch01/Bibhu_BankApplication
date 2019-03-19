package com.evry.training.bank.dao;

import com.evry.training.bank.dto.Ev_Loan;

public interface Ev_LoanDAO {
	Ev_Loan viewLoan(String loanId);
	boolean updateLoan(Ev_Loan ev_Loan);
}
