package com.eomcs.pms;

import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.pms.util.Prompt;

//1) 회원 데이터를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => addMember() 메서드 정의 및 회원 등록 코드를 가져오기
//   => main()과 addMember()가 서로 공유하는 변수는 클래스 변수로 만든다.
//2) 입력된 회원 데이터의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
//   => listMembers() 메서드 정의 및 관련된 코드를 가져오기
//3) 프로젝트 데이터를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => addProject() 메서드 정의 및 관련 코드를 가져오기
//   => main()과 addProject()가 서로 공유하는 변수는 클래스 변수로 만든다.
//4) 입력된 프로젝트 데이터의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
//   => listProjects() 메서드 정의 및 관련된 코드를 가져오기
//5) 작업 데이터를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => addTask() 메서드 정의 및 관련 코드를 가져오기
//   => main()과 addTask()가 서로 공유하는 변수는 클래스 변수로 만든다.
//6) 입력된 작업 데이터의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
//   => listTasks() 메서드 정의 및 관련된 코드를 가져오기
//7) 사용자로부터 명령어를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => prompt() 메서드를 정의하고 관련된 코드를 가져오기
//8) 명령어 뿐만 아니라 사용자로부터 입력을 받는 기능을 모두 prompt()를 사용하여 처리한다.
//   => prompt()를 호출할 때 사용자에게 출력할 프롬프트 메시지를 아규먼트로 넘긴다.
//   => prompt()는 호출할 때 넘어온 프롬프트 메시지 값을 파라미터로 받는다.
//9) prompt() 가 작업한 결과를 클래스 변수에 담지 말고 호출자에게 리턴한다.
//   => prompt()를 실행한 후 사용자가 입력한 문자열을 리턴한다.
//10) prompt()의 기능을 더 세분화한다.
//   => promptString() : 사용자로부터 문자열을 입력 받아 리턴한다.
//   => promptInt() : 사용자로부터 숫자를 입력 받아 리턴한다.
//   => promptDate() : 사용자로부터 날짜를 입력 받아 리턴한다.
//11) promtString(), promptInt(), promptDate() 메서드의 코드를 정리한다.
public class App {

  public static void main(String[] args) {

    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        // 메서드로 분리한 코드를 실행하기(메서드 호출)
        // => 메서드명();
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

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    Prompt.close();
  }

}












