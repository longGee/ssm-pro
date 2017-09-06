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
	修改EMP表数据  --约定大于配置<p>
	<form action="${pageContext.request.contextPath }/emp/update.do" method="post">
		<table>
			<tr>
				<td>编号</td>
				<td>
				${emp.empno }
				<input id="empno" name="empno" type="hidden" value="${emp.empno }"/>
				</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" id="ename" name="ename" value="${emp.ename}"></td>
			</tr>
			<tr>
				<td>工作</td>
				<td><input type="text" id="job" name="job" value="${emp.job}"></td>
			</tr>
			<tr>
				<td>上司编号</td>
				<td><input type="text" id="mgr" name="mgr" value="${emp.mgr}"></td>
			</tr>
			<tr>
				<td>工资</td>
				<td><input type="text" id="sal" name="sal" value="${emp.sal}"></td>
			</tr>
			<tr>
				<td>佣金</td>
				<td><input type="text" id="comm" name="comm" value="${emp.comm}"></td>
			</tr>
			<tr>
				<td>部门编号</td>
				<td><input type="text" id="deptno" name="deptno" value="${emp.deptno}"></td>
			</tr>
			<tr>
				<td colspan="2"><input id="sub" name="sub" type="submit" value="保存修改"/></td>
			</tr>
		</table>
	</form>
</body>
</html>