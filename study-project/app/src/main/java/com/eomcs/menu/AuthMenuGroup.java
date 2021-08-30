package com.eomcs.menu;

public class AuthMenuGroup extends MenuGroup{

  public AuthMenuGroup(String title) {
    super(title);
  }

  // 하위 메뉴로 출력하는 메서드를 재정의한다.
  // => 로그인 여부를 검사하는 경우
}
