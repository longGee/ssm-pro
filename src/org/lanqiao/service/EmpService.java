package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.Emp;

public interface EmpService {
	public List<Emp> list();
	public Emp getEmp(Integer empno);
	public void updateEmp(Emp emp);
	public void addEmp(Emp emp);
	public void deleteEmp(Integer empno);
}
