package com.eomcs.oop.ex00;

public class Exam100 {
	public static void main(String[] args) {
		
	test1();
	System.out.println(Test.a);
	test2();
	System.out.println(Test.a);
	}
	
	static void test1() {
		//스태틱 변수 사용
		// => 최조로 스태틱 멤버(변수, 메서)를 사용하는 시점에서 
		// 클래스가 로딩된다.
		// => 클래스가 로딩된 후 즉시 자동으로 스태틱 변수가 
		// Method Area 영역에 생성된다.
		
		Test.a = 100;
	}
	static void test2() {
		Test.a = 200;
	}
}
