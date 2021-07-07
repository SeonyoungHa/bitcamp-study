package com.eomcs.pms;

public class App2 {
  public static void main(String []args) {

    /*System.out.println("[프로젝트]");
    System.out.println("번호: 1201");
    System.out.println("프로젝트명: 미니 프로젝트 관리 시스템 개발");
    System.out.println("내용: 소규모 팀을 위한 프로젝트 관리 시스템을 개발한다.");
    System.out.println("시작일: 2020-01-01");
    System.out.println("종료일: 2020-12-31");
    System.out.println("만든이: 홍길동");
    System.out.println("팀원: 홍길동,김구,유관순,안중근,윤봉길");
     */
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.println("[프로젝트]");
    System.out.print("번호: ");
    int num = keyboard.nextInt();
    System.out.print("프로젝트명: ");
    String str = keyboard.nextLine();
    System.out.print("내용: ");
    String str2 = keyboard.nextLine();

    System.out.print("만든이: ");
    String name = keyboard.nextLine();    
    System.out.print("팀원: ");
    String names = keyboard.nextLine();

    keyboard.close();

  }
}
