package com.eomcs.menu;

// MenuItem과 MenuGroup을 같은 타입으로 묶기 위해 정의한 클래스이다.
// 이 클래스 자체는 직접 인스턴스를 만들어 사용하기 위함이 아니라
// 상속해주는 용도이기 때문에 추상 클래스로 정의한다.
public abstract class Menu {

  String title;

  boolean enableAuth;

  public Menu(String title) {
    this.title = title;
  }


  public Menu(String title, boolean enableAuth) {
    this(title);
    this.enableAuth = enableAuth;
  }
  public abstract void execute();
}
