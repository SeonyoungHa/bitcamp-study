package com.eomcs.pms;

import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {

  public static void main(String[] args) {

    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        MemberHandler.add();

      } else if (input.equals("/member/list")) {
        MemberHandler.list();

      }  else if (input.equals("/project/add")) {
        ProjectHandler.add();

      }  else if (input.equals("/project/list")) {
        ProjectHandler.list();

      }  else if (input.equals("/task/add")) {
        TaskHandler.add();

      }  else if (input.equals("/task/list")) {
        TaskHandler.list();

      }  else if (input.equals("/board/add")) {
        TaskHandler.add();

      }  else if (input.equals("/board/list")) {
        TaskHandler.list();

      }  else if (input.equals("/board2/add")) {
        TaskHandler.add();

      }  else if (input.equals("/board2/list")) {
        TaskHandler.list();

      }  else if (input.equals("/board3/add")) {
        TaskHandler.add();

      }  else if (input.equals("/board3/list")) {
        TaskHandler.list();

      }  else if (input.equals("/board4/add")) {
        TaskHandler.add();

      }  else if (input.equals("/board4/list")) {
        TaskHandler.list();

      }  else if (input.equals("/board5/add")) {
        TaskHandler.add();

      }  else if (input.equals("/board5/list")) {
        TaskHandler.list();

      }  else if (input.equals("/board6/add")) {
        TaskHandler.add();

      }  else if (input.equals("/board6/list")) {
        TaskHandler.list();

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    // Prompt 가 소유하고 관리하고 있는 자원을 닫으라고 명령한다. 
    Prompt.close();
  }
}












