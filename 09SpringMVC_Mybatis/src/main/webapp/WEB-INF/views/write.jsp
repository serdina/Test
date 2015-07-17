<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="writeui" method="post">
부서번호<input type="text" name="deptno"><br>
부서이름<input type="text" name="dname"><br>
부서위치<input type="text" name="loc"><br>
<input type="submit" value="글쓰기">
</form>
</body>
</html>