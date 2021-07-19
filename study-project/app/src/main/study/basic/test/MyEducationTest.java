package com.study.basic.test;

import com.study.basic.MyEducation;

public class MyEducationTest {

	public static void main(String[] args) {
		MyEducation edu = new MyEducation();
		edu.setInfo("자바", 80, "James"); //calling -> working
		edu.setDate(2021, 7, 14);
		
		edu.getDetails();
		System.out.println(edu.getDate());
	}

}
