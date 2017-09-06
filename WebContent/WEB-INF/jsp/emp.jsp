<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/check.js"></script>
</head>
<body>
	表数据
	<hr/>
	<a href="${pageContext.request.contextPath }/emp/dispatcher.do?type=add">添加</a>
	<table border="1" >
		<c:forEach items="${emps }" var="emp">
			<tr>
				<td>${emp.empno }</td>
				<td>${emp.ename }</td>
				<td>${emp.job }</td>
				<td>${emp.hiredate }</td>
				<td>${emp.mgr }</td>
				<td>${emp.sal }</td>
				<td>${emp.comm }</td>
				<td>${emp.deptno }</td>
				<td><a href="${pageContext.request.contextPath }/emp/edit.do?empno=${emp.empno }">编辑</a></td>
				<td><a href="${pageContext.request.contextPath }/emp/edit/${emp.empno }">编辑</a></td>
				<td><a href="${pageContext.request.contextPath }/emp/delete.do?empno=${emp.empno }" onclick="return confir()">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>