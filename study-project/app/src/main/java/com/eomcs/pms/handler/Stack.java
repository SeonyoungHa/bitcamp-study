package com.eomcs.pms.handler;

public class Stack extends ArrayList {


	// 스택에 값을 추가한다.
	public void push(Object item) {
		this.add(item);
	}

	public Object pop() {
		return this.remove(this.size() - 1 );
	}

}