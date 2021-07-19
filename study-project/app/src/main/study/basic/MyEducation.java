package com.study.basic;
/*
 * 여러줄을 한꺼번에 주석처리 할때 사용하는 comment
 * Multi line Comment
 * ::
 * 과목이름
 * 강의 개설일자
 * 시험성적
 * 담당교수 
 */
public class MyEducation {
	// Single line Comment
	// 필드..멤버변수(하나의 값이 들어가는 공간)
	String subject; //null
	int year; //0
	int month;
	int day;
	int score;
	String professorName;
	
	// 기능...메소드
	// 모든 변수에 저장된 값을 출력하는 기능...
	public void getDetails() { // 값을 출력
		System.out.println(subject+ "," + score + "," + professorName);
	}
	
	public String getDate() { // 값을 리턴 
		return year + "-" + month + "-" + day; //호출한 곳으로 리턴된다. 
	}
	
	//필드에 값을 넣어주는 기능을 추가
	public void setInfo(String s, int sc, String name) { //working 
		subject = s;
		score = sc;
		professorName = name;
	}
	public void setDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
		
}




