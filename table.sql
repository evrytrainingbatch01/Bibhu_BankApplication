create table customer(customerId varchar(30),name varchar(30),username varchar(30),password varchar(30));

 create table account(customerId varchar(30),
     accountId varchar(16),
     accounttype varchar(15),
     accountstatus tinyint(1),
     ammount double(20,2),
     creationdate datetime,
     pin int);
	
 create table customerdetail(customerId varchar(30),
     emailid varchar(30),
     dob date,
     religion varchar(20),
     nationality varchar(20),
     state varchar(20),
     adharcard bigint);
	
 create table loan(userId varchar(30),
     loanid varchar(30),
     loantype varchar(20),
     loanstatus tinyint(1),
     approve datetime,
     creditdate datetime,
     ammount double(20,2),
     tenure float(2,1));
	
 create table transaction(accountId varchar(30),
     bankname varchar(30),
     otp varchar(10),
     payeeName varchar(30),
     ammount double(20,2),
     ifccode varchar(10),
     transactiontype varchar(10));
	
 create table customer_detail(
     customerid varchar(30),
     emailid varchar(30),
     dob date,
     nationality varchar(30),
     state varchar(30),
     religion varchar(30));