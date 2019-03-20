package com.evry.training.bank.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.evry.training.bank.config.Ev_BankQueryConst;
import com.evry.training.bank.dao.Ev_LoanDAO;
import com.evry.training.bank.dto.Ev_Loan;
import com.evry.training.bank.util.ConnectionProvider;
import com.evry.training.bank.util.DatabaseException;

public class Ev_LoanDAOImpl implements Ev_LoanDAO{

	@Override
	public Ev_Loan viewLoan(String loanId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateLoan(Ev_Loan ev_Loan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applyLoan(Ev_Loan ev_Loan) {
		boolean result=false;
		Connection connection=ConnectionProvider.getConnection();
		if(connection != null){
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(Ev_BankQueryConst.INSERT_LOAN);
				System.out.println(ev_Loan);
				preparedStatement.setString(1, ev_Loan.getLoanId());
				preparedStatement.setString(2, ev_Loan.getLoanType());
				preparedStatement.setDouble(3, ev_Loan.getAmmount());
				preparedStatement.setFloat(4, ev_Loan.getTenure());
				preparedStatement.execute();
				result=true;
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(new DatabaseException("DB Not Connected"));
			}
		}
		return result;
	}

}
