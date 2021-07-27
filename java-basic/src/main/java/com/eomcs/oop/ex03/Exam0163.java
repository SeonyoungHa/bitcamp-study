// 클래스 변수의 응용 : 상수 변수를 이용하여 import하기
//
package com.eomcs.oop.ex03;

// 스태틱 변수를 사용할 때 다음과 같이 소속 클래스를 미리 밝혀두면
// 클래스 이름 없이 스태틱 변수를 사용할 수 있다.
public class Exam0163 {

  // 여러개를 한번에 명시하고 싶다면 다음과 같이 wildcard(*)로 지정해도 된다.
  public static void main(String[] args) {

    // Member와 관련된 상수라면 
    // Member 클래스에 선언하는 것이 유지보수에 더 낫다.

    Member m4 = new Member();
    m4.id = "aaa";
    m4.password = "1111";
    m4.type = Member.GUEST;
    // 스태틱 변수는 변수명 앞에 클래스명을 명시해야 한다.
    // static때문에 163은 안써도 됨

    Member m5 = new Member();
    m5.id = "bbb";
    m5.password = "1111";
    m5.type = Member.MANAGER;

    Member m6 = new Member();
    m6.id = "ccc";
    m6.password = "1111";
    m6.type = Member.MEMBER;
  }
}








