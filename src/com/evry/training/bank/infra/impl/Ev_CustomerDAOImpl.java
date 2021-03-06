package com.evry.training.bank.infra.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.evry.training.bank.config.Ev_BankQueryConst;
import com.evry.training.bank.domain.Ev_Account;
import com.evry.training.bank.domain.Ev_Customer;
import com.evry.training.bank.domain.Ev_CustomerDetail;
import com.evry.training.bank.domain.Ev_Transaction;
import com.evry.training.bank.infra.Ev_CustomerDAO;
import com.evry.training.bank.util.ConnectionProvider;
import com.evry.training.bank.util.DatabaseException;

public class Ev_CustomerDAOImpl implements Ev_CustomerDAO {

	@Override
	public Ev_Account viewAccount(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ev_Transaction transferAmmount(Ev_Transaction ev_Transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCustomer(Ev_Customer customer) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection connection = ConnectionProvider.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(Ev_BankQueryConst.INSERT_CUSTOMER);
				preparedStatement.setString(1, customer.getCustomerId());
				preparedStatement.setString(2, customer.getName());
				preparedStatement.setString(3, customer.getUserName());
				preparedStatement.setString(4, customer.getPassword());
				preparedStatement.execute();
				result = true;
			} catch (SQLException e) {
				System.out.println(new DatabaseException("Not able to connect to database check configuration details"));
			}
		}
		return result;
	}

	@Override
	public boolean deleteCustomer(String customerId) {
		boolean result = false;
		Connection connection = ConnectionProvider.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(Ev_BankQueryConst.DELETE_CUSTOMER);
				preparedStatement.setString(1, customerId);
				preparedStatement.execute();
				result=true;
			} catch (SQLException e) {
				System.out.println(new DatabaseException("Not able to connect to database check configuration details"));
			}
			
		}
		return result;
	}

	@Override
	public List<Ev_Customer> viewAllCustomers() {
		Connection connection = ConnectionProvider.getConnection();
		List<Ev_Customer> customers=null;
		if (connection != null) {
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(Ev_BankQueryConst.ALL_CUSTOMER);
				ResultSet resultSet=preparedStatement.executeQuery();
				customers=new ArrayList<>();
				while(resultSet.next()){
					Ev_Customer customer=new Ev_Customer();
					customer.setCustomerId(resultSet.getString("customerId"));
					customer.setName(resultSet.getString("name"));
					customer.setUserName(resultSet.getString("username"));
					customers.add(customer);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customers;
	}

	@Override
	public boolean addCustomerDetail(Ev_CustomerDetail customerDetail) {
		boolean result = false;
		Connection connection = ConnectionProvider.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(Ev_BankQueryConst.INSERT_CUSTOMER_DETAIL);
				preparedStatement.setString(1, customerDetail.getCustomerId());
				preparedStatement.setString(2, customerDetail.getEmailId());
				preparedStatement.setDate(3, new java.sql.Date(customerDetail.getDob().getTime()));
				preparedStatement.setString(4, customerDetail.getNationality());
				preparedStatement.setString(5, customerDetail.getState());
				preparedStatement.setString(6, customerDetail.getReligion());
				preparedStatement.execute();
				result = true;
			} catch (SQLException e) {
				System.out.println(new DatabaseException("Not able to connect to database check configuration details"));
			}
		}
		return result;
	}

}
