package com.eomcs.menu;

public abstract class AuthMenu extends Menu{
  boolean enableAuth;

  public AuthMenu(String title, boolean enableAuth) {
    super(title); // 수퍼클래스의 생성자를 호출하여 메뉴 이름을 설정한다.
    this.enableAuth = enableAuth;
  }
}
