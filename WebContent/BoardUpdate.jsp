<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<meta name="viewport" content="width-device-width">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/basic.css">
<style>
	.hidden {
		display: none;
	}
</style>
<title>Build Board</title>
</head>
<body>
	<%
		Date nowDate = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 mm월 dd일 a hh:mm");
	%>
	<!-- 게시판 글쓰기 -->
	<div class="container">
		<div class="row">
			<form action="update" method="post">
				<table class="table" style="text-align: center; border: 1px solid">
					<tbody>
						<tr>
							<th>글 제목</th>
							<td><input type="text"></td>
						</tr>
						<tr>
							<th>작성 일자</th>
							<td>
								<!-- DB에서 받은값 -->
							</td>
						</tr>
						<tr class="hidden">
							<th>수정 일자</th>
							<td>
								<%= sf.format(nowDate) %>
							</td>
						</tr>
						<tr>
							<th>글쓴이</th>
							<td style="text-align: left">혜징</td>
						</tr>
						<tr>
							<td colspan="2"><textarea class="form-control"
									placeholder="너의 열정을 펼쳐봐" name="content" maxlength="2048"
									style="height: 350px;"></textarea></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" class="btn btn-primary pull-right" value="수정">
				<button onClick="delete">삭제</button>
			</form>
		</div>
	</div>

</body>
</html>