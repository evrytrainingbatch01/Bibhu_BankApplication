package com.evry.training.bank.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormaterUtil {
	public Date formatDate(String format,String date){
		Date formatedDate=null;
		try {
			formatedDate=new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Date");
		}
		return formatedDate;
	}
}
