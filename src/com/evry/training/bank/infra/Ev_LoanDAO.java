package com.evry.training.bank.infra;

import com.evry.training.bank.domain.Ev_Loan;

public interface Ev_LoanDAO {
	Ev_Loan viewLoan(String loanId);
	boolean updateLoan(Ev_Loan ev_Loan);
	boolean applyLoan(Ev_Loan ev_Loan);
}
