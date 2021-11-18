package com.servlet;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

	DataSource dataSource;

	public BoardDAO() {
		// 기본생성자 => Context 생성
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/Oracle11g");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// SELECT ALL
	public ArrayList<BoardDTO> getList() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = dataSource.getConnection();
			String selSql = "SELECT * FROM BOARD";

			pstmt = con.prepareStatement(selSql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int bId = rs.getInt("board_id");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				// 날짜
				Date cdate = rs.getDate("cdate");
				Date udate = rs.getDate("udate");

				BoardDTO board = new BoardDTO(title, content, writer);
				board.setBId(bId);
				board.createDate = cdate;
				board.updateDate = udate;

				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return list;

	}

	// SELECT ONE
	public BoardDTO getOne(int bId) {
		BoardDTO board = new BoardDTO();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = dataSource.getConnection();
			String selSql = "SELECT * FROM BOARD WHERE board_id = ?";

			pstmt = con.prepareStatement(selSql);
			pstmt.setInt(1, bId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				board.bId = rs.getInt("board_id");
				board.writer = rs.getString("writer");
				board.title = rs.getString("title");
				board.content = rs.getString("content");
				// 날짜
				Date cdate = rs.getDate("cdate");
				Date udate = rs.getDate("udate");

				board.createDate = cdate;
				board.updateDate = udate;
			}

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return board;
	}

	// INSERT
	public int insert(BoardDTO board) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String inrtSql = "INSERT INTO Board(board_id, title, writer, content)" +"VALUES(BOARD_SEQ.nextval, ?, ?, ?)";

			pstmt = con.prepareStatement(inrtSql);
			pstmt.setString(1, board.title);
			pstmt.setString(2, board.writer);
			pstmt.setString(3, board.content);
			res = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return res;
	}

	// DELETE
	public int delete(int boardId) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String delSql = "DELETE FROM Board WHERE board_id=?";

			pstmt = con.prepareStatement(delSql);
			pstmt.setInt(1, boardId);
			res = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return res;
	}

	// UPDATE
	public int update(BoardDTO board) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String updSql = "UPDATE BOARD SET title = ?, content = ?, udate = sysdate";

			pstmt = con.prepareStatement(updSql);
			pstmt.setString(1, board.title);
			pstmt.setString(2, board.content);
			res = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return res;
	}

}
