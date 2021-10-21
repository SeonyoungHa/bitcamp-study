package com.eomcs.pms.dao.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;

// 역할
// - 게시글을 DBMS 서버를 통해 관리한다.
//
public class MybatisBoardDao implements BoardDao {

  SqlSession sqlSession;

  public MybatisBoardDao(SqlSession sqlSession) {
    this.sqlSession = sqlSession;
  }

  @Override
  public void insert(Board board) throws Exception {
    //    try (PreparedStatement stmt = con.prepareStatement(
    //        "insert into pms_board(title,content,member_no) values(?,?,?)")) {
    //
    //      stmt.setString(1, board.getTitle());
    //      stmt.setString(2, board.getContent());
    //      stmt.setInt(3, board.getWriter().getNo());
    //
    //      if (stmt.executeUpdate() == 0) {
    //        throw new Exception("게시글 데이터 입력 실패!");
    //      }
    //    }
  }

  @Override
  public List<Board> findAll() throws Exception {
    return sqlSession.selectList("BoardMapper.findAll");
  }

  @Override
  public List<Board> findByKeyword(String keyword) throws Exception {
    return null;
    return sqlSession.selectList("BoardMapper.findByKeyword", keyword);
  }

  @Override
  public Board findByNo(int no) throws Exception {
    return null;
    return sqlSession.selectOne("BoardMapper.findByNo", no);
  }

  @Override
  public void update(Board board) throws Exception {
    //    try (PreparedStatement stmt = con.prepareStatement(
    //        "update pms_board set"
    //            + " title=?,content=?"
    //            + " where board_no=?")) {
    //
    //      stmt.setString(1, board.getTitle());
    //      stmt.setString(2, board.getContent());
    //      stmt.setInt(3, board.getNo());
    //
    //      if (stmt.executeUpdate() == 0) {
    //        throw new Exception("게시글 데이터 변경 실패!");
    //      }
    //    }
  }

  @Override
  public void delete(int no) throws Exception {
    //    try (PreparedStatement stmt = con.prepareStatement(
    //        "delete from pms_board where board_no=?")) {
    //
    //      stmt.setInt(1, no);
    //
    //      if (stmt.executeUpdate() == 0) {
    //        throw new Exception("게시글 데이터 삭제 실패!");
    //      }
    //    }
  }
}



