// local class 에서 바깥 메서드의 로컬 변수 접근
package com.eomcs.oop.ex11.d;

class D {

	void m1() {
		int a = 100;
		int b = 200;

		class X {

			// 로컬 클래스에서 바깥 메서드(m1())의 로컬 변수(a,b) 값을 사용한다면
			// 사용하는 로컬 변수의 값을 저장할 필드(a)를 자동으로 추가한다.
			// 또한 로컬 클래스의 객체를 생성할 때 그 값을 사용할 수 있도록
			// 생성자에 로컬 변수의 값을 받는 파라미터를 추가한다.
			// .class 파일의 코드:
			//      class com.eomcs.oop.ex11.d.D$1X {
			//
			//        int v3; <== 로컬 클래스의 인스턴스 필드
			//        final synthetic com.eomcs.oop.ex11.d.D this$0;  <== 바깥 클래스의 인스턴스 주소 저장
			//        private final synthetic int val$v2; <== 바깥 메서드의 로컬 변수 저장
			//
			void f1() {
				System.out.println(a); // m1() 에 선언된 로컬 변수를 가르킨다.
			}
		}
		X obj = new X();
		obj.f1();
	}

	static void m2() {
		int a;
		int b;

		class X {

			// 로컬 클래스는 바깥 메서드의 로컬 변수의 값을 저장할 필드를 자동으로 추가한다.
			// .class 파일의 코드:
			//      class com.eomcs.oop.ex11.d.D$1X {
			//
			//        int v3; <== 로컬 클래스의 인스턴스 필드
			//        final synthetic com.eomcs.oop.ex11.d.D this$0;  <== 바깥 클래스의 인스턴스 주소 저장
			//        private final synthetic int val$v2; <== 바깥 메서드의 로컬 변수 저장
			//
		}

		X obj = new X();
	}
}

public class Exam0310 {

	public static void main(String[] args) {
		D obj = new D();
		obj.m1();
	}

}
