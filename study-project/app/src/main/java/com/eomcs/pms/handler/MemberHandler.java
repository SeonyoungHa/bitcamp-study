package com.eomcs.pms.handler;

import java.sql.Date;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberHandler {

	static final int MAX_LENGTH = 5;

	Member[] members = new Member[MAX_LENGTH];
	int size = 0;

	public void add() {
		System.out.println("[회원 등록]");

		Member member = new Member();

		member.no = Prompt.inputInt("번호? ");
		member.name = Prompt.inputString("이름? ");
		member.email = Prompt.inputString("이메일? ");
		member.password = Prompt.inputString("암호? ");
		member.photo = Prompt.inputString("사진? ");
		member.tel = Prompt.inputString("전화? ");
		member.registeredDate = new Date(System.currentTimeMillis());

		this.members[this.size++] = member;
	}

	public void list() {
		System.out.println("[회원 목록]");
		for (int i = 0; i < this.size; i++) {
			System.out.printf("%d, %s, %s, %s, %s\n", 
					this.members[i].no, 
					this.members[i].name, 
					this.members[i].email, 
					this.members[i].tel, 
					this.members[i].registeredDate);
		}
	}

	boolean exist(String name) {
		for (int i = 0; i < this.size; i++) {
			if (this.members[i].name.equals(name)) {
				return true;
			}
		}
		return false;
	}

	public void delete() {
		System.out.println("[게시글 삭제]");
		int no = Prompt.inputInt("번호?");


		Member member = null;
		int memberIndex = -1;

		// Board 인스턴스가 들어있는 배열을 뒤져서
		// 게시글 번호와 일치하는 Board인스턴스를 찾는다.

		for (int i = 0; i < this.size; i++) {
			if (members[i].no == no) {
				memberIndex = i;
				break;
			}
		}

		if (memberIndex == -1) {
			System.out.println("해당 번호의 게시글이 없습니다.");
			return;
		}

		String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N)");
		if (input.equalsIgnoreCase("n") || input.length() == 0) {
			System.out.println("게시글 삭제를 취소하였습니다.");
			return;
		}

		for (int i = memberIndex; i < this.size; i++) {
			this.members[i] = this.members[i + 1];
		}
		this.members[this.size -1] = null;

		this.size--;
		System.out.println("게시글을 삭제하였습니다.");
	}


}







