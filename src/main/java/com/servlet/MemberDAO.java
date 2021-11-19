package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
	DataSource dataSource;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/Oracle11g");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	// Select
	public MemberDTO getMember(String memId) {
		MemberDTO mem = new MemberDTO();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			String selSql = "SELECT * FROM member WHERE mem_id = ?";
			pstmt = con.prepareStatement(selSql);
			pstmt.setString(1, memId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem.memId = rs.getString("mem_id");
				mem.memPw = rs.getString("mem_pw");
				mem.name = rs.getString("mem_name");
				mem.mdn = rs.getString("mem_mdn");
				mem.email = rs.getString("mem_email");
				mem.joinDate = rs.getDate("cdate");
				mem.uDate = rs.getDate("udate");
			}
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
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
		
		return mem;
	}
	
	// insert
	public int insert(MemberDTO mem) {
		int res =0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String inrtSql = "INSERT INTO Member(mem_id, mem_pw, mem_name, mem_email, mem_addr, mem_mdn) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(inrtSql);
			pstmt.setString(1, mem.memId);
			pstmt.setString(2, mem.memPw);
			pstmt.setString(3, mem.name);
			pstmt.setString(4, mem.email);
			pstmt.setString(5, mem.addr);
			pstmt.setString(6, mem.mdn);
			
			res = pstmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
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
	
	// delete
	public int delete(int memId) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String delSql = "DELETE FROM Member WHERE _id=?";

			pstmt = con.prepareStatement(delSql);
			pstmt.setInt(1, memId);
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
	
	// update
	public int update(MemberDTO mem, int memId) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String delSql = "UPDATE Member SET mem_email = ?, mem_addr = ?, mem_mdn WHERE _id=?";

			pstmt = con.prepareStatement(delSql);
			pstmt.setString(1, mem.email);
			pstmt.setString(2, mem.addr);
			pstmt.setString(3, mem.mdn);
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
