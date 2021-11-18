package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateBoard
 */
@WebServlet("/update")
public class UpdateBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBoard() {
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
		
		BoardDAO dao = new BoardDAO();
		BoardDTO board = new BoardDTO();
		
		int bId = Integer.parseInt(request.getParameter("board_id"));
		board = dao.getOne(bId);
		board.title = request.getParameter("title");
		board.content = request.getParameter("content");
		
		int result = dao.update(board);
		if(result == 1) {
			out.print("<script>alert('�Խñ��� �����Ǿ����ϴ�')</script>");
			response.sendRedirect("list");
			out.flush();
		}else {
			out.print("<script>alert('�ٽ� �õ��ϼ���')</script>");
			out.flush();
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
