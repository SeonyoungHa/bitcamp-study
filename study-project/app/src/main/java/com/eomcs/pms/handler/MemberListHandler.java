package com.eomcs.pms.handler;

import java.util.ArrayList;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberListHandler extends AbstractMemberHandler{


  List<Member> memberList;

  public MemberListHandler(List<Member> memberList) {
    super(memberList);
  }
  public void list() {
    System.out.println("[회원 목록]");

    Member[] list = memberList.toArray(new Member[0]);

    for (Member member : list) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          member.getNo(), 
          member.getName(), 
          member.getEmail(), 
          member.getTel(), 
          member.getRegisteredDate());
    }
  }

  private Member findByNo(int no) {
    for (Member member : memberList) {
      if (member.getNo() == no) {
        return member;
      }
    }
    return null;
  }

  private Member findByName(String name) {
    for (Member member : memberList) {
      if (member.getName().equalsIgnoreCase(name)) {
        return member;
      }
    }
    return null;
  }

  private static Member findByName(String name, List<Member> memberList) {
    for (Member member : memberList) {
      if (member.getName().equalsIgnoreCase(name)) {
        return member;
      }
    }
    return null;
  }

  public boolean exist(String name) {
    for (Member member : memberList) {
      if (member.getName().equals(name)) {
        return true;
      }
    }
    return false;
  }

  public Member promptMember(String label) {
    while (true) {
      String memberName = Prompt.inputString(label);
      if (memberName.length() == 0) {
        return null;
      }

      Member member = findByName(memberName);
      if (member != null) {
        return member;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }
  }

  public static Member promptMember(String label, List<Member> memberList) {
    while (true) {
      String memberName = Prompt.inputString(label);
      if (memberName.length() == 0) {
        return null;
      }

      Member member = findByName(memberName, memberList);
      if (member != null) {
        return member;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }
  }

  public List<Member> promptMembers(String label) {
    ArrayList<Member> members = new ArrayList<>();

    while (true) {
      String memberName = Prompt.inputString(label);
      Member member = findByName(memberName);
      if (member != null) {
        members.add(member);
        continue;
      } else if (memberName.length() == 0) {
        break;
      } 
      System.out.println("등록된 회원이 아닙니다.");
    }
    return members;
  }
}







