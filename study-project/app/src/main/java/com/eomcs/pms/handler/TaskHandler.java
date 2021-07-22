package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskHandler {

	static final int MAX_LENGTH = 5;

	Task[] tasks = new Task[MAX_LENGTH];
	int size = 0;

	//다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
	public void add(MemberHandler memberHandler) {
		System.out.println("[작업 등록]");

		Task task = new Task();

		task.no = Prompt.inputInt("번호? ");
		task.content = Prompt.inputString("내용? ");
		task.deadline = Prompt.inputDate("마감일? ");

		System.out.println("상태?");
		System.out.println("0: 신규");
		System.out.println("1: 진행중");
		System.out.println("2: 완료");
		task.status = Prompt.inputInt("> ");

		while (true) {
			String owner = Prompt.inputString("담당자?(취소: 빈 문자열) ");
			if (owner.length() == 0) {
				System.out.println("작업 등록을 취소합니다.");
				return; // 현재 메서드의 실행을 멈추고 리턴한다.
			} else if (memberHandler.exist(owner)) {
				task.owner = owner;
				break;
			}
			System.out.println("등록된 회원이 아닙니다.");
		}

		this.tasks[this.size++] = task;
	}

	//다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
	public void list() {
		System.out.println("[작업 목록]");

		for (int i = 0; i < this.size; i++) {
			String stateLabel = null;
			switch (tasks[i].status) {
			case 1:
				stateLabel = "진행중";
				break;
			case 2:
				stateLabel = "완료";
				break;
			default:
				stateLabel = "신규";
			}

			System.out.printf("%d, %s, %s, %s, %s\n",
					this.tasks[i].no, 
					this.tasks[i].content, 
					this.tasks[i].deadline, 
					stateLabel, 
					this.tasks[i].owner);
		}
	}

	public void delete() {
		System.out.println("[게시글 삭제]");
		int no = Prompt.inputInt("번호?");


		Task task = null;
		int taskIndex = -1;

		// Board 인스턴스가 들어있는 배열을 뒤져서
		// 게시글 번호와 일치하는 Board인스턴스를 찾는다.

		for (int i = 0; i < this.size; i++) {
			if (tasks[i].no == no) {
				taskIndex = i;
				break;
			}
		}

		if (taskIndex == -1) {
			System.out.println("해당 번호의 게시글이 없습니다.");
			return;
		}

		String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N)");
		if (input.equalsIgnoreCase("n") || input.length() == 0) {
			System.out.println("게시글 삭제를 취소하였습니다.");
			return;
		}

		for (int i = taskIndex; i < this.size; i++) {
			this.tasks[i] = this.tasks[i + 1];
		}
		this.tasks[this.size -1] = null;

		this.size--;
		System.out.println("게시글을 삭제하였습니다.");
	}

}
