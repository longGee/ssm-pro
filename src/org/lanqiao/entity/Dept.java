package org.lanqiao.entity;

public class Dept {
	private Integer deptno;
	private String loc;
	private String dname;
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	
	public Dept(Integer deptno, String loc, String dname) {
		super();
		this.deptno = deptno;
		this.loc = loc;
		this.dname = dname;
	}


	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", loc=" + loc + ", dname=" + dname + "]";
	}

	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
