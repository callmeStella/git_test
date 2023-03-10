package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet{
	
	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// korean
		response.setContentType("type-plain");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("안녕하세요");
		
		Date now = new Date();
		out.println(now);
		
		// formatter
		// 2023-02-24 19:22:22
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH-mm-ss");
		out.println(sdf.format(now));
		
		
	}
	

}
