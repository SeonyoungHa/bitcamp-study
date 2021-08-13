// inner class : 바깥 클래스의 인스턴스 멤버 접근하기
package com.eomcs.oop.ex11.c;

class B2 {

  // 인스턴스 멤버
  int v2 = 20;
  void m2() {}

  class X {

    void test() {
      // 바깥 객체의 인스턴스 멤버에 접근하려면,
      // inner 객체에 보관된 바깥 객체의 주소를 사용해야 한다.
      // 즉 컴파일러가 내부적으로 자동 생성한 바깥 객체 주소를 담는 필드를 사용해야 한다.
      // 문제는 컴파일러가 자동 생성한 필드 이름이 뭔지 모른다.
      // 그래서 자바는 inner 객체에 보관된 바깥 객체를 가리키기 위해
      // 다음의 문법을 제공하고 있다.
      // =>   바깥클래스명.this
      //
      System.out.println(B2.this.v2); 
      System.out.println(B2.this.v3); 
      System.out.println(B2.this.v4); 
      System.out.println("-------------------------");
    }
  }
}

public class Exam0220 {

  public static void main(String[] args) {
    B outer = new B();

    B.X obj = outer.new X();
    obj.test();

    System.out.println("=================================");

    System.out.println(B.v1);
    System.out.println(outer.v2);
  }

}
