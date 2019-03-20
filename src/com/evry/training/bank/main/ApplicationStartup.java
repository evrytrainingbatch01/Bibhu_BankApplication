package com.evry.training.bank.main;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.evry.training.bank.config.Ev_BankConstants;
import com.evry.training.bank.dto.Ev_Account;
import com.evry.training.bank.dto.Ev_Customer;
import com.evry.training.bank.dto.Ev_CustomerDetail;
import com.evry.training.bank.dto.Ev_Loan;
import com.evry.training.bank.service.Ev_AccountService;
import com.evry.training.bank.service.Ev_CustomerService;
import com.evry.training.bank.service.Ev_LoanService;
import com.evry.training.bank.service.impl.Ev_AccountServiceImpl;
import com.evry.training.bank.service.impl.Ev_CustomerServiceImpl;
import com.evry.training.bank.service.impl.Ev_LoanServiceImpl;
import com.evry.training.bank.util.DateFormaterUtil;

public class ApplicationStartup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		do {
			System.out.println("Enter your choice ADMIN(1)/CUSTOMER(2)");
			int choice = scanner.nextInt();
			boolean result = false;
			switch (choice) {
			case 1:
				System.out.println("Add Customer(1)");
				System.out.println("Add Customer Detail(2)");
				System.out.println("Add Account(3)");
				System.out.println("Delete Account(4)");
				System.out.println("View All Customer(5)");
				System.out.println("Enter Choice >>>>>>>> ");
				Ev_CustomerService ev_CustomerService = new Ev_CustomerServiceImpl();
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Add Customer");
					Ev_Customer customer = new Ev_Customer();
					System.out.println("Customer ID : ");
					customer.setCustomerId(scanner.next());
					System.out.println("Name : ");
					customer.setName(scanner.next());
					System.out.println("Password : ");
					customer.setPassword(scanner.next());// sensitive data
					System.out.println("User Name : ");
					customer.setUserName(scanner.next());
					result = ev_CustomerService.addCustomer(customer);
					if (result) {
						System.out.println("Success");
					} else {
						System.out.println("Fail");
					}
					break;
				case 2:
					System.out.println("Add Customer Detail");
					Ev_CustomerDetail customerDetail = new Ev_CustomerDetail();
					System.out.println("Customer Id : ");
					customerDetail.setCustomerId(scanner.next());
					System.out.println("Email Id : ");
					customerDetail.setEmailId(scanner.next());
					System.out.println("Date Of Birth : ");
					String date = scanner.next();
					Date dob = new DateFormaterUtil().formatDate("dd-MM-yyyy", date);
					if (dob != null) {
						customerDetail.setDob(dob);
					}
					System.out.println("Adhar Card Number : ");
					customerDetail.setAdharCard(scanner.nextLong());
					System.out.println("Nationality : ");
					customerDetail.setNationality(scanner.next());
					System.out.println("State : ");
					customerDetail.setState(scanner.next());
					System.out.println("Religion : ");
					customerDetail.setReligion(scanner.next());
					result = ev_CustomerService.addCustomerDetail(customerDetail);
					if (result) {
						System.out.println("Success");
					} else {
						System.out.println("Fail");
					}
					break;
				case 3:
					Ev_AccountService accountService = new Ev_AccountServiceImpl();
					System.out.println("Add Account");
					Ev_Account account = new Ev_Account();
					System.out.println("Account Id : ");
					account.setAccountId(scanner.next());
					System.out.println("Customer Id : ");
					account.setUserId(scanner.next());
					System.out.println("Account Type");
					account.setAccountType(scanner.next());
					account.setAccountStatus(Ev_BankConstants.ACCOUNT_ACTIVE);
					System.out.println("Ammount : ");
					account.setAmmount(scanner.nextDouble());
					account.setCreationDate(new Date());
					System.out.println("Pin");
					account.setPin(1234);
					result = accountService.addAccount(account);
					if (result) {
						System.out.println("Success");
					} else {
						System.out.println("Fail");
					}
					break;
				case 4:
					System.out.println("Delete Account");
					System.out.println("Account Id : ");
					result = ev_CustomerService.deleteCustomer(scanner.next());
					if (result) {
						System.out.println("Success");
					} else {
						System.out.println("Fail");
					}
					break;
				case 5:
					System.out.println("All Customers");
					List<Ev_Customer> customers = ev_CustomerService.viewAllCustomers();
					customers.forEach(customerDetails -> System.out
							.println("Customer ID : " + customerDetails.getCustomerId() + " Name : "
									+ customerDetails.getName() + " UserId : " + customerDetails.getUserName()));
					break;

				default:
					System.out.println("Wrong option");
					break;
				}
				break;

			case 2:

				System.out.println("View Account(1)");
				System.out.println("Apply Loan(2)");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("View Account");
					Ev_AccountService accountService = new Ev_AccountServiceImpl();
					System.out.println("Enter Account No : ");
					Ev_Account account = accountService.viewAccount(scanner.next());
					System.out
							.println("Account ID : " + account.getAccountId() + " Balance : " + account.getAccountId());
					break;
				case 2:
					System.out.println("Apply Loan");
					Ev_Loan loan = new Ev_Loan();
					System.out.println("Loan Ammount : ");
					loan.setAmmount(scanner.nextDouble());
					System.out.println("Loan Type : ");
					loan.setLoanType(scanner.next());
					System.out.println("Tenure : ");
					loan.setTenure(scanner.nextFloat());
					Ev_LoanService loanService = new Ev_LoanServiceImpl();
					result = loanService.applyLoan(loan);
					if (result) {
						System.out.println("Success");
					} else {
						System.out.println("Fail");
					}
					break;
				default:
					System.out.println("Wrong Choice");
				}
				break;
			default:
				System.out.println("Wrong choice Enter 1/2");
			}
			System.out.println("Want to contintinue : Y/N");
			if (scanner.next().equals("N")) {
				repeat = false;
			}
		} while (repeat);

	}

}
