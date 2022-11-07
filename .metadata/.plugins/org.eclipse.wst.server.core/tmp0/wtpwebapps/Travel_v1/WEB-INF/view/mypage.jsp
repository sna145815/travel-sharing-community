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
		.sectiontable {
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
			border-bottom: 1px solid #f5f5f5;
			text-align: center;
			vertical-align: middle;
			word-break: break-all;
		}
		.button {
			margin-top: 50px;
			margin-left: 20%;
		}
		.btn_update {
			width: 120px;
			height: 30px;
			font-size: 15px;
			border-collapse: collapse;
			vertical-align: middle;
			color: rgb(255, 255, 255);
			background-color: rgb(50, 50, 50);
		}
		.btn_cancel, .btn_check {
			width: 200px;
			height: 50px;
			margin: 20px;
			padding: 10px;
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
							<a href="/deleteuser" class="post">내가 쓴 글</a>
							<a href="#" class="comment">내가 쓴 댓글</a>
						</div>
					</nav>
					<!-- 콘텐츠 내용 -->
					<section class ="content_right">
						<header class="sectiontitle">
							<h5>회원정보수정</h5>
						</header>
						<div>
							<form action="/mypage" method="post">
								<table class="sectiontable">	
									<tr>
										<td width=200px>아이디<td>
										<td id="userId" width=300px><strong>${user.id}</strong></td>
									</tr>
									<tr>
										<td>비밀번호 확인<td>
										<td><input type="password" name="pwd" placeholder="비밀번호 확인" size=15/></td>
										<td><span id="checkpw"></span></td>
									</tr>
									<tr>
										<td>비밀번호 수정<td>
										<td><input type="password" name="uppwd" placeholder="비밀번호 수정" size=15/></td>
									</tr>
									<tr>
										<td>비밀번호 재확인<td>
										<td><input type="password" name="pwdr" placeholder="비밀번호 재확인" size=15/></td>
										<td>
											<span id="checkpwdr"><button type="submit" class="btn_update">비밀번호 변경</button></span>
										</td>
									</tr>	
									<tr>
										<td>생년월일<td>
										<td id="userbirth"><strong>${user.date}</strong></td>
									</tr>
									<tr>
										<td>성별<td>
										<td id="userGender"><strong>${user.gender}</strong></td>
									</tr>
								</table>
							</form>
						</div>
						<div class="button">
							<span>
								<button type="submit" class="btn_cancel" onclick="location.reload()">취소</button>
							</span>
							<span>
								<button type="submit" class="btn_check" onclick="location.href = '/main';">확인</button>
							</span>
						</div>	
					</section>
				</div>
			</div>
		</div>
	</div>
</body>
</html>