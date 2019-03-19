package com.evry.training.bank.dao;

import java.util.List;

import com.evry.training.bank.dto.Ev_Account;
import com.evry.training.bank.dto.Ev_Customer;
import com.evry.training.bank.dto.Ev_CustomerDetail;
import com.evry.training.bank.dto.Ev_Transaction;

public interface Ev_CustomerDAO {
	Ev_Account viewAccount(String customerId);
	Ev_Transaction transferAmmount(Ev_Transaction ev_Transaction);
	boolean addCustomer(Ev_Customer customer);
	boolean deleteCustomer(String customerId);
	List<Ev_Customer> viewAllCustomers();
	boolean addCustomerDetail(Ev_CustomerDetail customerDetail);
}
