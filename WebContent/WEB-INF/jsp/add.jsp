<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	添加员工<p>
	<form action="${pageContext.request.contextPath }/emp/add.do" method="post">
		<table>
			<tr>
				<td>编号</td>
				<td>
				<input id="empno" name="empno" type="text" value=""/>
				</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" id="ename" name="ename" value=""></td>
			</tr>
			<tr>
				<td>工作</td>
				<td><input type="text" id="job" name="job" value=""></td>
			</tr>
			<tr>
				<td>上司编号</td>
				<td><input type="text" id="mgr" name="mgr" value=""></td>
			</tr>
			<tr>
				<td>雇佣时间</td>
				<td><input type="text" id="hiredate" name="hiredate" value=""></td>
			</tr>
			<tr>
				<td>工资</td>
				<td><input type="text" id="sal" name="sal" value=""></td>
			</tr>
			<tr>
				<td>佣金</td>
				<td><input type="text" id="comm" name="comm" value=""></td>
			</tr>
			<tr>
				<td>部门编号</td>
				<td><input type="text" id="deptno" name="deptno" value=""></td>
			</tr>
			<tr>
				<td colspan="2"><input id="sub" name="sub" type="submit" value="添加"/></td>
			</tr>
		</table>
	</form>
</body>
</html>