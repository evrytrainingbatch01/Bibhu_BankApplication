package com.evry.training.bank.main;

import java.util.Date;
import java.util.Scanner;

import com.evry.training.bank.dto.Ev_Customer;
import com.evry.training.bank.dto.Ev_CustomerDetail;
import com.evry.training.bank.service.Ev_CustomerService;
import com.evry.training.bank.service.impl.Ev_CustomerServiceImpl;
import com.evry.training.bank.util.DateFormaterUtil;

public class ApplicationStartup {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice ADMIN(1)/CUSTOMER(2)");
		int choice=scanner.nextInt();
		boolean result=false;
		switch (choice) {
		case 1:
			System.out.println("Add Customer(1)");
			System.out.println("Add Customer Detail(2)");
			System.out.println("Add Account(3)");
			System.out.println("Delete Account(4)");
			System.out.println("Delete Customer(5)");
			System.out.println("View Loan(6)");
			System.out.println("Update Loan(7)");
			System.out.println("Update Transaction(8)");
			System.out.println("View Transaction(9)");
			System.out.println("Enter Choice >>>>>>>> ");
			Ev_CustomerService ev_CustomerService=new Ev_CustomerServiceImpl();
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add Customer");
				Ev_Customer customer=new Ev_Customer();
				System.out.println("Customer ID : ");
				customer.setCustomerId(scanner.next());
				System.out.println("Name : ");
				customer.setName(scanner.next());
				System.out.println("Password : ");
				customer.setPassword(scanner.next());//sensitive data
				System.out.println("User Name : ");
				customer.setUserName(scanner.next());
				result=ev_CustomerService.addCustomer(customer);
				if(result){
					System.out.println("Success");
				}else{
					System.out.println("Fail");
				}
				break;
			case 2:
				System.out.println("Add Customer Detail");
				Ev_CustomerDetail customerDetail=new Ev_CustomerDetail();
				System.out.println("Customer Id : ");
				customerDetail.setCustomerId(scanner.next());
				System.out.println("Email Id : ");
				customerDetail.setEmailId(scanner.next());
				System.out.println("Date Of Birth : ");
				String date=scanner.next();
				Date dob=new DateFormaterUtil().formatDate("dd-MM-yyyy", date);
				if(dob != null){
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
				result=ev_CustomerService.addCustomerDetail(customerDetail);
				if(result){
					System.out.println("Success");
				}else{
					System.out.println("Fail");
				}
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			default:
				break;
			}
			break;

		case 2:
			choice=scanner.nextInt();
			System.out.println("View Account(1)");
			System.out.println("Apply Loan(2)");
			System.out.println("Transfer Fund(3)");
			break;
		default:
			System.out.println("Wrong choice Enter 1/2");
		}
		
	}

}
