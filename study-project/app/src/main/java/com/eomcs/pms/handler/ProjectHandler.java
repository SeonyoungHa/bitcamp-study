package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;
import com.eomcs.pms.util.Prompt;

public class ProjectHandler {

  static final int MAX_LENGTH = 5;
  static Project[] projects = new Project[MAX_LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[프로젝트 등록]");

    Project project = new Project();

    project.no = Prompt.inputInt("번호? ");
    project.title = Prompt.inputString("프로젝트명? ");
    project.content = Prompt.inputString("내용? ");
    project.startDate = Prompt.inputDate("시작일? ");
    project.endDate = Prompt.inputDate("종료일? ");

    while (true) {
      String owner = Prompt.inputString("만든이? (취소: 빈 문다열)");
      if (MemberHandler.exist(owner)) {
        project.owner = owner;
        break;
      } else if (owner.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return; //메서드 실행을 즉시 종료!
      }
      System.out.println("등록된 회원이 아닙니다.");
    } 

    String members = "";
    while (true) {
      String member = Prompt.inputString("팀원?(완료: 빈 분자열) ");
      if (MemberHandler.exist(member)) {
        if (members.length() > 0) {
          members += ",";
        }
        members += "," + member;
        continue;
      } else if (member.length() == 0) {
        break;
      } System.out.println("등록된 회원이 아닙니다.");
    }

    projects[size++] = project;
  }

  public static void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < size; i++) {
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, [%s]\n", // 출력 형식 지정
          projects[i].no, 
          projects[i].title, 
          projects[i].startDate, 
          projects[i].endDate, 
          projects[i].owner,
          projects[i].members);
    }
  }

}
