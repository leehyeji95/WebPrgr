package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
		MemberDAO dao = new MemberDAO();
		
		String memId = request.getParameter("mem_id");
		String memPw = request.getParameter("mem_pw");
		String mame = request.getParameter("mem_name");
		String email = request.getParameter("mem_email");
		String addr = request.getParameter("mem_addr");
		String mdn = request.getParameter("mem_mdn");
		MemberDTO mem = new MemberDTO(memId, memPw, mame, email, mdn, addr);
		int res =dao.insert(mem);
		if(res == 1) {
			// Success Sign In
			response.sendRedirect("SignInForm.jsp");
		} else {
			response.sendRedirect("SignUpForm.jsp");
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
