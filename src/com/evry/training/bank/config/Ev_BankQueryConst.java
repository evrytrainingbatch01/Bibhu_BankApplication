package com.evry.training.bank.config;

public interface Ev_BankQueryConst {
	public static final String INSERT_CUSTOMER="insert into customer values(?,?,?,?)";
	public static final String INSERT_CUSTOMER_DETAIL="insert into customer_detail values(?,?,?,?,?,?)";
	public static final String INSERT_ACCOUNT="insert into account values(?,?,?,?,?,?,?)";
	public static final String VIEW_ACCOUNT="select * from account where customerId=?";
	public static final String ALL_CUSTOMER="select * from customer";
	public static final String DELETE_CUSTOMER="delete from customer where customerId=?";
	public static final String INSERT_LOAN="insert into loan(loanid,loantype,ammount,tenure) values (?,?,?,?)";
}