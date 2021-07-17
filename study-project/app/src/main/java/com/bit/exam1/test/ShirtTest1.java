package com.bit.exam1.test;

import com.bit.exam1.Shirt;

public class ShirtTest1 {
	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();
		Shirt shirt2 = new Shirt();
		Shirt shirt3 = new Shirt();
		
		//setShirt() 호출해서 Shirt클래스의 필드에 값을 주입함..
		shirt1.setShirt("Chanel", true, 40.0);
		shirt2.setShirt("Givency", true, 100.0);
		shirt3.setShirt("Bvgrl", true,300.0);
		
	
		//각각의 Shirt 객체에 주입된 값을 출력받아본다.
		System.out.println(shirt1.getShirt());
		shirt1.discount(10.0);
		System.out.println("\n=====================================\n");
		
		System.out.println(shirt2.getShirt());
		shirt2.discount(20.0);
		System.out.println("\n=====================================\n");
		
		System.out.println(shirt3.getShirt());
		shirt3.discount(30.0);
		System.out.println("\n=====================================\n");

	}

}

/*
 *  exam1 코드에서의 문제점
 *  Shirt를 100개 생성해야 할 경우
 *  객체 생성코드 100줄 
 *  +
 *  객체에 값을 입력하는 코드 setShirt() 100줄 이 추가되어야 한다.
 *  
 *  --> 객체를 생성하는 것과 동시에 입력하는 방법은?
 *  
 *  exam2에서 명시적 생성자로 코드를 업데이트 시켜보자
 * 
 * 
 * 
 * 
*/












