package org.lanqiao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lanqiao.entity.Dept;
import org.springframework.web.HttpRequestHandler;

public class DeptController2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dept dept = new Dept(20, "北京", "人事");
		request.setAttribute("dept", dept);
		request.getRequestDispatcher("/WEB-INF/jsp/dept.jsp").forward(request, response);
	}
	

}
