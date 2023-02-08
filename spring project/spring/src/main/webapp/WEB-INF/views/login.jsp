<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello World!
</h1>
<!--필드 이름을 썼을때 필드를 직접 호출하는게 아니라 getter 호출
xxx.name을 쓰면 xxx.getName()이 호출된다.  -->
<form action="/spring/Login" method="post">
<input type="text" name="id"> <br>
<input type="password" name="pw"> <br>
<button>로그인</button>
</form>
</body>
</html>
