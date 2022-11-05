<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="/layout/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="form-group row pull-right" style="float: right;" >
<form action="board?cmd=search" method="post">
<div class="col-xs-8">
			<input class="form-control" name="title" type="text" size="20">
		</div>
		<div class="col-xs-2" style="float: right">
			<button class="btn btn-primary" type="submit" >검색</button>
		</div>
</form>
		
	</div>
<table class="table" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">번호</th>
						<th style="background-color: #eeeeee; text-align: center;">제목</th>
						<th style="background-color: #eeeeee; text-align: center;">작성자</th>
						<th style="background-color: #eeeeee; text-align: center;">작성일</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="n" items="${lists}">
					<tr>
						<td>${n.listID}</td>
						<td>${n.title}</td>
						<td>${n.userID}</td>
						<td>${n.date}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		
<div style="float: right;">
<a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a>
</div>
</div>

</body>
</html>