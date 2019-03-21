package com.evry.training.bank.infra.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.evry.training.bank.config.Ev_BankQueryConst;
import com.evry.training.bank.domain.Ev_Account;
import com.evry.training.bank.infra.Ev_AccountDAO;
import com.evry.training.bank.util.ConnectionProvider;
import com.evry.training.bank.util.DatabaseException;

public class Ev_AccountDAOImpl implements Ev_AccountDAO {

	@Override
	public boolean addAccount(Ev_Account ev_Account) {
		Connection connection = ConnectionProvider.getConnection();
		boolean result = false;
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(Ev_BankQueryConst.INSERT_ACCOUNT);
				preparedStatement.setString(1, ev_Account.getUserId());
				preparedStatement.setString(2, ev_Account.getAccountId());
				preparedStatement.setString(3, ev_Account.getAccountType());
				preparedStatement.setInt(4, ev_Account.getAccountStatus());
				preparedStatement.setDouble(5, ev_Account.getAmmount());
				preparedStatement.setDate(6, new java.sql.Date(ev_Account.getCreationDate().getTime()));
				preparedStatement.setInt(7, ev_Account.getPin());
				preparedStatement.execute();
				result = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				new DatabaseException("DB not connected");
			}
		}
		return result;
	}

	@Override
	public boolean deleteAccount(String accountId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ev_Account viewAccount(String customerId) {
		// TODO Auto-generated method stub
		Ev_Account account=null;
		Connection connection = ConnectionProvider.getConnection();
		if (connection != null) {
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement(Ev_BankQueryConst.VIEW_ACCOUNT);
				preparedStatement.setString(1, customerId);
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next()){
					account=new Ev_Account();
					account.setAccountId(resultSet.getString("accountId"));
					account.setAmmount(resultSet.getDouble("ammount"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				new DatabaseException("DB not connected");
			}
			
		}
		return account;
	}

}
