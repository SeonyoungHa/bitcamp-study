// inner class : 바깥 클래스의 인스턴스 멤버 접근하기
package com.eomcs.oop.ex11.c;

class B3 {

  // 인스턴스 멤버
  int v1 = 10;

  class X {
    int v1 = 100;

    void test() {
      int v2 = 1000;

      System.out.println(v1); //로컬 변수 
      System.out.println(this.v1); // 인스턴스 변수 
      System.out.println(B3.this.v1); // 바깥 객체의 인스턴스 변수 
    }
  }
}

public class Exam0230 {

  public static void main(String[] args) {
    B3 outer = new B3();
    B3.X obj = outer.new X();
    obj.test();
  }

}
