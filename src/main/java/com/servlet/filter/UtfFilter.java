package com.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UtfFilter implements Filter{
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println(" --- filter init() ---");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(" --- filter doFilter() ---");
		
		/*
		 * 				req
		 *	======= ----------- filter -->  ======
		 *	브라우저 |						   | 웹서버
		 *	=======	<---------- filter -->	======
		 *				res
		 */
		
		// request filter
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=utf-8");
		
		chain.doFilter(req, res);
		// response filter
	}
	@Override
	public void destroy() {
		System.out.println(" --- filter destroy() ---");
	}

}
