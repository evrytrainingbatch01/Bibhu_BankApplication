package com.evry.training.bank.service;

import java.util.List;

import com.evry.training.bank.dto.Ev_Account;
import com.evry.training.bank.dto.Ev_Customer;
import com.evry.training.bank.dto.Ev_CustomerDetail;
import com.evry.training.bank.dto.Ev_Transaction;

public interface Ev_CustomerService {
	boolean addCustomer(Ev_Customer customer);
	boolean addCustomerDetail(Ev_CustomerDetail customerDetail);
	boolean deleteCustomer(String customerId);
	List<Ev_Customer> viewAllCustomers();
}
