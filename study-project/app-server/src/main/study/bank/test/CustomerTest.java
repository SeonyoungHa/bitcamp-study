package com.study.bank.test;

import com.study.bank.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerInfo("홍길동" , "1999-10-12", "서울시 서대문구 연희동");
		
		System.out.println(customer.getCustomerInfo());
	}

}
