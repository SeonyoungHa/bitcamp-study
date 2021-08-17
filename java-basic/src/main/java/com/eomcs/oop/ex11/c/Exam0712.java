// inner class 응용 I : 2단계 - 논스태틱 중첩 클래스(inner class) 사용 
package com.eomcs.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0712 {
	public static void main(String[] args) {
		Musics1 m1 = new Musics1();
		m1.add("aaa.mp3");
		m1.add("bbb.mp3");
		m1.add("ccc.mp3");

		Musics1 m2 = new Musics1();
		m2.add("xxx.mp3");
		m2.add("yyy.mp3");

		// Player가 사용할 Musics 객체는
		// 생성자를 호출할 때 파라미터로 넘겨줘야 한다.
		Musics1.Player p1 = new Musics1.Player(m1);
		Musics1.Player p2 = new Musics1.Player(m2);

		p1.play();
		p2.play();
	}
}


class Musics2 {

	List<String> songs = new ArrayList<>();

	public void add(final String song) {
		songs.add(song);
	}

	public void delete(final int index) {
		songs.remove(index);
	}

	// 중첩 클래스가 바깥 클래스의 객체를 사용해야 한다면,
	// 스태틱 중첩 클래스로 만들지 말고 논스태틱 중첩 클래스(inner class)로 만들라.
	// 왜?
	// - 바깥 클래스의 인스턴스를 저장할 필드가 자동 생성된다.
	// - 생성자가 바깥 클래스의 인스턴스를 받도록 자동으로 파라미터가 추가된다.
	class Player {

		// 1) 논스태틱 중첩 클래스는 바깥 클래스의 인스턴스 주소를 저장할 필드가 내장되어 있기 때문에
		// 다음과 같이 따로 선언할 필요가 없다.
		// Musics1 musics;

		// 2) 바깥 클래스의 인스턴스를 받는 파라미터가 생성자에 자동으로 추가되기 때문에
		// 다음과 같이 바깥 클래스의 객체를 받는파라미터를 개발자가 직접 선언할 필요가 없다.
		public Player(/*Musics1 musics*/) {
			// 따라서 바깥 클래스의 객체 주소를 인스턴스 필드에 저장하는 코드를 작성할 필요가 없다.
			//	this.musics = musics;
		}

		public void play() {
			// 필드에 보관되어 있는 Musics 객체에서 음악 파일을 꺼내 플레이 한다.
			for (final String song : musics.songs) {
				System.out.println(song);
			}
			System.out.println("-----------------------------");
		}
	}

}


