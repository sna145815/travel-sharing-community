<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/layout/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%boolean Result= (boolean)request.getAttribute("Result"); %>
	
	<script>
	<%if(Result){ %>	
		alert('비밀번호 변경 성공');
		location.href = '/mypage';
	<%}else{ %>
		alert('비밀번호 변경 실패\n비밀번호를 다시 확인해세요');
		location.href = '/mypage';
	<%} %>
	</script>
</body>
</html>