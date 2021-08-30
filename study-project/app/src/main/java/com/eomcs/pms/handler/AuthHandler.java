package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class AuthHandler {

  List<Member> memberList;
  static Member loginUser; //로그인 정보를 담을 필드 추가
  // displayLoginUser() 메서드 추가

  public static Member getLoginUser() {
    return loginUser; //   // login()변경: 로그인 한 후 멤버 객체를 로그인 필드에 저장

  }

  public AuthHandler(List<Member> memberList) {
    this.memberList = memberList;
  }

  public void login() {
    System.out.println("[로그인]");
    String email = Prompt.inputString("이메일? ");
    String password = Prompt.inputString("암호? ");

    Member member = findByEmailPassword(email, password);

    if (member == null) {
      System.out.println("이메일과 암호가 일치하는 회원을 찾을 수 없습니다.");
    } else {
      System.out.printf("%s님 환영합니다!\n", member.getName());
    }
  }

  public void displayLoginUser() {
    System.out.println("[내정보]");

    if (loginUser == null) {
      System.out.println("로그인 하지 않았습니다.");
      return;
    } 

    System.out.printf("이름: %s\n", loginUser.getName());
    System.out.printf("이메일: %s\n", loginUser.getEmail());
    System.out.printf("사진: %s\n", loginUser.getPhoto());
    System.out.printf("전화: %s\n", loginUser.getTel());
    System.out.printf("등록일: %s\n", loginUser.getRegisteredDate());
  }



  public void logout() {
    System.out.println("[로그아웃]");
    loginUser = null;
    System.out.println("로그인 하지 않았습니다.");
    return;
  }

  private Member findByEmailPassword(String email, String password) {
    Member[] arr = memberList.toArray(new Member[0]);
    for (Member member : arr) {
      if (member.getEmail().equalsIgnoreCase(email) &&
          member.getPassword().equals(password)) {
        return member;
      }
    }
    return null;
  }


}








