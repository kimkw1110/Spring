<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign_in.jsp 파일</title>
</head>
<body>
	<h1>sign in.jsp file</h1>
	<form action="/member/signInConfirm">
		ID : <input type="text" name="m_id" ><br />
		PW : <input type="password" name="m_pw" ><br />
		<input type="submit" value="SIGN IN">
		<input type="reset" value="CANCEL">
	</form>
</body>
</html>