package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		Date now = new Date();
		PrintWriter out = response.getWriter();
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss 초");
		out.println("현재 시간은 " + sdf.format(now) + "입니다.");
		
		
	}

}
