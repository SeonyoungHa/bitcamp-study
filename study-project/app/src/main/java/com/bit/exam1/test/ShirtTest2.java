//5 기본 생성자와 명시적 생성자에 대해서 정리한다.
// 이걸 정리하기 이전에 생성자가 무엇인지 알아야 한다..!!!
package com.bit.exam1.test;

import com.bit.exam2.Shirt; //exam2 에서의 Shirt 클래스

public class ShirtTest2 {
	public static void main(String[] args) {
		Shirt shirt1 = new Shirt("Chanel", true, 40.0);
		Shirt shirt2 = new Shirt("Givency", true, 100.0);
		Shirt shirt3 = new Shirt("Bvgrl", true,300.0);
		
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












