package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetMethodQuiz05 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		// 퀴리스트링에 들어있는 파라미터 꺼내기 
		int number = Integer.valueOf(request.getParameter("number"));
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>구구단 </title></head><body>");
		out.println("<ul>");
		for (int i = 1; i <= 9; i++) {
			out.print("<li> " + number + " X " + i + " = " + (number * i) + "</li>");
		}
		out.println("</ul></body></html>");
	}

}
