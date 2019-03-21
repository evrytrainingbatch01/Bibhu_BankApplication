package com.evry.training.bank.service.impl;

import java.util.List;

import com.evry.training.bank.domain.Ev_Account;
import com.evry.training.bank.domain.Ev_Customer;
import com.evry.training.bank.domain.Ev_CustomerDetail;
import com.evry.training.bank.domain.Ev_Transaction;
import com.evry.training.bank.infra.Ev_CustomerDAO;
import com.evry.training.bank.infra.impl.Ev_CustomerDAOImpl;
import com.evry.training.bank.service.Ev_CustomerService;

public class Ev_CustomerServiceImpl implements Ev_CustomerService{
	
    Ev_CustomerDAO customerDao=new Ev_CustomerDAOImpl();

	@Override
	public boolean addCustomer(Ev_Customer ev_Customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(ev_Customer);
	}

	@Override
	public boolean deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(customerId);
	}

	@Override
	public List<Ev_Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.viewAllCustomers();
	}

	@Override
	public boolean addCustomerDetail(Ev_CustomerDetail customerDetail) {
		// TODO Auto-generated method stub
		return customerDao.addCustomerDetail(customerDetail);
	}

}
