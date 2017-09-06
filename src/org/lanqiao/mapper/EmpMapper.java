package org.lanqiao.mapper;

import java.util.List;

import org.lanqiao.entity.Emp;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpMapper {
	
	public List<Emp> emps() ;
	public Emp getEmp(Integer empno);
	public void updateEmp(Emp emp);
	public void insertEmp(Emp emp);
	public void deleteEmp(Integer empno);
}
