package com.day15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Date {
	

	
	

	public static void main(String[] args) {
		Date d=new Date();
	Scanner s=new Scanner(System.in);
		
		try {
			String j=s.nextLine();
			LocalDate curr=LocalDate.now();
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("DD-MM-YYYY");
			LocalDate k=LocalDate.parse(j, dtf);
			Period p=Period.between(k, curr);
	      if(p.getYears()>=0&& p.getMonths()>=0&&p.getDays()>=0){
	    	System.out.println(p.getYears());  
	      }
	      else {
	    	  System.out.println("in future date");
	      }
		}
		catch(Exception e) {
			System.out.println("invalid date");
		}
		System.out.println("final");
	}

}
