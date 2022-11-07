<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/layout/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<style>
		* {
			margin: 0;
			padding: 0;
		}
		#wrap {
			width: auto;
			min-width: 1560px;
			max-width: 1880px;
			padding: 0px 40px;
			margin: 0px auto;
			box-sizing: border-box;
		}
		#sub_header {
			position: relative;
			padding: 0px 0px 10px;
			margin: 0px auto;
		}
		.visual_area {
			padding: 5px 0px 8px;
			font-size: inherit;
			font-weight: normal;
		}
		.txt > a {
			display: inline-block;
			font-size: 30px;
			font-weight: normal;
			color: rgb(0, 0, 0);
		}
		.menu_area {
			float : left;
			width : 270px;
			border-right: 1px solid #ddd;
		}
		.content_right {
			position: absolute;
			left: 270px;
			top: 200;
			right: 0;
			min-width: 1229px;
		}
		.menu_area { 
		 	width: 170px;
		 	float: left;
		 	margin: 24px 40px 0px 0px;
		 	font-size: 14px;
		}
		.menu1, .menu2 {
			display: flex;
			flex-direction: column;
			padding-bottom: 15px;
		}
		.update, .delete, .post, .comment {
			display: flex;
			margin-top: 2px;
			font-size: 16px;
			line-height: 30px;
			color: rgb(110, 110, 110);
		}
		.content-right {
			padding: 0;
			float: right;
		}
		.sectiontitle {
			border-bottom: 2px solid #000000;
			padding-left: 10px;
			padding-bottom: 14px;
			margin-top: 22px;
			line-height: 1.5px;
			font-size: 14px;
			position: relative;
		}
		.password {
			padding: 3px 0 35px 0;
		}
		.inputpwd {
			margin-top: 22px;
			padding: 10px;
			font-size: 15px;
			border-collapse: collapse;
			table-layout: fixed;
			margin-left: 20%;
		}
		tr {
			height: 70px;
			padding: 10px;
			box-sizing: border-box;
			text-align: center;
			vertical-align: middle;
			word-break: break-all;
		}
		.button {
			margin-left: 30%;
		}
		.btn_delete {
			width: 200px;
			height: 50px;
			font-size: 15px;
			border-collapse: collapse;
			vertical-align: middle;
			color: rgb(255, 255, 255);
			background-color: rgb(50, 50, 50);
		}
	</style>
</head>
<body>
	<div id="wrap">
		<div id ="header">
			<div class="visual_area">
				<h1 class="txt">
					<a href="/mypage">My Page</a>
				</h1>
			</div>
		</div>
		<div id ="content_area">
			<div class ="content">
				<div class="content_in">
					<!-- 좌측 메뉴 -->
					<nav class="menu_area">
						<div class="menu1">
							<h5>개인정보관리</h5>
							<a href="/mypage" class="update">회원정보수정</a>
							<a href="/deleteuser" class="delete">회원탈퇴</a>
						</div>
						<div class="menu2">
							<h5>게시판</h5>
							<a href="#" class="post">내가 쓴 글</a>
							<a href="#" class="comment">내가 쓴 댓글</a>
						</div>
					</nav>
					<!-- 콘텐츠 내용 -->
					<section class ="content_right">
						<header class="sectiontitle">
							<h5>회원탈퇴</h5>
						</header>
						<form action="/deleteuser" method="post">
							<div class="password">
								<table class="inputpwd">
									<tr>
										<td width=180px><label for="myPwd">비밀번호</label></td>
										<td><input type="password" name="pwd" placeholder="비밀번호" size=20/></td>
									</tr>
									<tr>
										<td><label for="PwdR">비밀번호 확인</label></td>
										<td><input type="password" name="pwdr" placeholder="비밀번호 확인" size=20/></td>
									</tr>
								</table>
							</div>	
							<div class="button">
								<button type="submit" class="btn_delete">탈퇴</button>
							</div>	
						</form>
					</section>
				</div>
			</div>
		</div>
	</div>
</body>
</html>