package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListBoard
 */
@WebServlet("/list")
public class ListBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		
		ArrayList<BoardDTO> bList = new ArrayList<BoardDTO>();
		
		
		BoardDAO dao = new BoardDAO();
		bList = dao.getList();
		
		
		/*
		DataSource dataSource;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");

			con = dataSource.getConnection();
			String selSql = "SELECT * FROM board";
			pstmt = con.prepareStatement(selSql);
			
			// System.out.println("CHK : "+insertSql);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				int boardId = rs.getInt("board_id");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				// ³¯Â¥
				Date cdate = rs.getDate("cdate");
				Date udate = rs.getDate("udate");
				
				BoardDTO board = new BoardDTO(title, content, writer);
				board.setBId(boardId);
				board.createDate = cdate;
				board.updateDate = udate;
				
				bList.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();// TODO: handle exception
			}
		}
		*/

		request.setAttribute("boardList", bList);
		request.getRequestDispatcher("BoardList.jsp").forward(request, response);
		//response.sendRedirect("BoardList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
