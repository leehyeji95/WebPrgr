package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
@WebServlet("/create")
public class CreateBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBoard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title");
		//String date = request.getParameter("cdate");
		//Date cdate = Date.valueOf(date);
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		BoardDTO board = new BoardDTO(title, content, writer);
		/* Setter �̿��� ���
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		*/
		
		BoardDAO dao = new BoardDAO();
		int result = dao.insert(board);
		if(result == 1) {
			out.print("<script>alert('�Խñ� ��� ����')</script>");
			response.sendRedirect("BoardList.jsp");
			out.flush();
		}else {
			out.print("<script>alert('�ٽ� �õ��ϼ���')</script>");
			response.sendRedirect("BoardCreate.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
