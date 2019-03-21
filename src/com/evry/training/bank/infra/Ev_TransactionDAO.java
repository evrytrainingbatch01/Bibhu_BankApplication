package com.evry.training.bank.infra;

import com.evry.training.bank.domain.Ev_Transaction;

public interface Ev_TransactionDAO {
	boolean updateTransaction(String transactionId);
	Ev_Transaction viewTransaction(String transactionId);
}
