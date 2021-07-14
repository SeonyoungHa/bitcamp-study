package com.study.bank;

public class Customer {

	String name;
	String birthDate;
	String address;
	
	public void setCustomerInfo(String n, String b, String a) {
		name = n;
		birthDate = b;
		address = a;
	}
	
	public String getCustomerInfo() {
		return name + "," + birthDate + "," + address;
	}
}
