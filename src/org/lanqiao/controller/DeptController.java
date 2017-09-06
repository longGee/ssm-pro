package org.lanqiao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lanqiao.entity.Dept;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DeptController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Dept dept = new Dept(10, "北京", "人事");
		modelAndView.addObject("dept",dept);
		modelAndView.setViewName("dept");
		return modelAndView;
	}

}
