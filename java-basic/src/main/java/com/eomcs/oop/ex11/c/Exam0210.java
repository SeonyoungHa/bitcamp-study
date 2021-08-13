// inner class : 다른 멤버에 접근하기
package com.eomcs.oop.ex11.c;

class B {
  // 클래스 멤버
  static int v1 = 10;
  static void m1() {}

  class X {
    void test() {
      // 같은 클래스 멤버 접근 가능
      System.out.println(B.v1);
      B.m1();
      System.out.println("-------------------------");

      // 같은 클래스 멤버이기 때문에 바깥 클래스 이름 생략 가능
      System.out.println(v1); 
      m1(); 
      System.out.println("-------------------------");
    }
  }
}

public class Exam0210 {

  public static void main(String[] args) {
    B outer = new B();

    B.X obj = outer.new X();
    obj.test();

    System.out.println("=================================");

    System.out.println(B.v1);
    System.out.println(outer.v2);
  }

}
