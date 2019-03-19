package com.evry.training.bank.dao;

import com.evry.training.bank.dto.Ev_Transaction;

public interface Ev_TransactionDAO {
	boolean updateTransaction(String transactionId);
	Ev_Transaction viewTransaction(String transactionId);
}
