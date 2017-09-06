package org.lanqiao.service.impl;

import java.util.List;

import org.lanqiao.entity.Emp;
import org.lanqiao.mapper.EmpMapper;
import org.lanqiao.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpMapper empMapper;
	@Override
	public List<Emp> list() {
		return empMapper.emps();
	}
	@Override
	public Emp getEmp(Integer empno) {
		return empMapper.getEmp(empno);
	}
	@Override
	public void updateEmp(Emp emp) {
		empMapper.updateEmp(emp);
	}
	@Override
	public void addEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}
	@Override
	public void deleteEmp(Integer empno) {
		empMapper.deleteEmp(empno);
	}
	
}
