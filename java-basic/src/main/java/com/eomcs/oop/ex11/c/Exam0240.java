// inner class : 바깥 클래스의 인스턴스 멤버 접근하기
package com.eomcs.oop.ex11.c;

class B3 {

  // 인스턴스 멤버
  int v1 = 10;
  int v2 = 20;

  class X {
    int v1 = 100;

    void test() {
      int v2 = 2000;

      System.out.println(v1); //로컬 변수 
      System.out.println(this.v1); // 인스턴스 변수 
      System.out.println(B3.this.v1); // 바깥 객체의 인스턴스 변수 

      // this 를 생략하면 항상 가장 가까운 곳부터 찾는다.
      System.out.println(v2); // => test() 메서드의 로컬 변수를 가리킨다.
      System.out.println(v3); // => this.v3 : X 클래스의 인스턴스 변수를 가리킨다.
      System.out.println(v4); // => B.this.v4 : 바깥 클래스 B의 인스턴스 변수를 가리킨다.

      // => inner class 의 가장 큰 특징은 바깥 클래스의 다른 멤버에 손쉽게 접근할 수 있다는 것이다.
      // => 이것이 가능한 이유는 바깥 클래스의 인스턴스 멤버이기 때문이다.
    }
  }
}

public class Exam0240 {

  public static void main(String[] args) {
    B outer = new B();

    B.X obj = outer.new X();
    obj.test();

    System.out.println("=================================");

    System.out.println(B.v1);
    System.out.println(outer.v2);
  }

}
