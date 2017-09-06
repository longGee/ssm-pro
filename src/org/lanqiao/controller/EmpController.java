
package org.lanqiao.controller;

import java.util.List;

import org.lanqiao.entity.Emp;
import org.lanqiao.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/emp")
@Controller
public class EmpController {
	@Autowired
	EmpService empservice;
	@RequestMapping("/emp.do")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView();
		List<Emp> emps = empservice.list();
		modelAndView.addObject("emps",emps);
		modelAndView.setViewName("emp");
		return modelAndView;
	}
	@RequestMapping("/edit.do")
	public ModelAndView getEmp(Integer empno) {
		ModelAndView modelAndView = new ModelAndView();
		Emp emp = empservice.getEmp(empno);
		modelAndView.addObject("emp",emp);
		modelAndView.setViewName("edit");
		return modelAndView;
	}
	@RequestMapping("/edit/{empno}")
	public ModelAndView getEmp1(@PathVariable("empno") Integer empno) {
		ModelAndView modelAndView = new ModelAndView();
		Emp emp = empservice.getEmp(empno);
		modelAndView.addObject("emp",emp);
		modelAndView.setViewName("edit");
		return modelAndView;
	}
	@RequestMapping("/update.do")
	public ModelAndView updateEmp(Emp emp) {
		ModelAndView modelAndView = new ModelAndView();
		empservice.updateEmp(emp);
		modelAndView.setViewName("forward:emp.do");
		return modelAndView;
	}
	@RequestMapping("/delete.do")
	public ModelAndView deleteEmp(Integer empno) {
		ModelAndView modelAndView = new ModelAndView();
		empservice.deleteEmp(empno);
		modelAndView.setViewName("redirect:emp.do");
		return modelAndView;
	}
	@RequestMapping("/add.do")
	public String addEmp(Emp emp) {
		empservice.addEmp(emp);
		return "redirect:emp.do";
	}
	@RequestMapping("/dispatcher.do")
	public ModelAndView dispatcher(String type) {
		ModelAndView modelAndView = new ModelAndView();
		if (type.equals("add")) {
			modelAndView.setViewName("add");
		}
		return modelAndView;
	}
}

