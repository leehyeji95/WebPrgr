<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.servlet.BoardDAO" %>
<%@ page import="com.servlet.BoardDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<title>Build Board</title>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</head>
<body>
	<%
		Date nowDate = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 m월 dd일 a hh:mm");
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		BoardDAO board = new BoardDAO();
		BoardDTO one = board.getOne(bId);
	%>
	<!-- 게시판 글쓰기 -->
	<div class="container" style="margin:0">
		<div class="row">
			<form action="update" method="post">
				<table class="table">
					<tbody>
						<tr class="hidden">
							<th>글 ID</th>
							<td><input type="text" name="board_id" value="<%= one.getBId() %>"></td>
						</tr>
						<tr>
							<th>글 제목</th>
							<td><input type="text" name="title" value="<%= one.getTitle() %>"></td>
						</tr>
						<tr>
							<th>작성 일자</th>
							<td>
								<input type="text" name="cdate" value="<%= one.getCreateDate() %>">
							</td>
						</tr>
						<tr>
							<th>글쓴이</th>
							<td style="text-align: left"><input type="text" name="writer" value="<%= one.getWriter() %>"></td>
						</tr>
						<tr>
							<td colspan="2"><textarea class="form-control"
									placeholder="너의 열정을 펼쳐봐" name="content" maxlength="2048"
									style="height: 350px;"><%= one.getContent() %></textarea></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" class="btn btn-primary pull-right" value="수정">
			</form>		
				<button type="button" onclick="location.href='delete?bId=<%= one.getBId() %>'" class="btn btn-primary pull-right">삭제</button>
		</div>
	</div>

</body>
</html>