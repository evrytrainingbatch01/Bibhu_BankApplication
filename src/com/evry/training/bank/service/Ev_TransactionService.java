package com.evry.training.bank.service;

import com.evry.training.bank.dto.Ev_Transaction;

public interface Ev_TransactionService {
	boolean updateTransaction(String transactionId);
	Ev_Transaction viewTransaction(String transactionId);
	Ev_Transaction transferAmmount(Ev_Transaction ev_Transaction);
}
