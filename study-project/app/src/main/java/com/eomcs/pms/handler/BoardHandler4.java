package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;


public class BoardHandler4 {

  static final int MAX_LENGTH = 0;
  static Board[] boards = new Board [MAX_LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[새 게시물]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());

    boards[size++] = board;
  }


  public static void list() {
    System.out.println("[게시글 목록4]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          boards[i].no, 
          boards[i].title, 
          boards[i].content, 
          boards[i].writer, 
          boards[i].registeredDate,
          boards[i].viewCount);
    }
  }

}
