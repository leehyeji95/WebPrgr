<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Build Board</title>
</head>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<body>
	<%
		Date nowDate = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm");
	%>
	<!-- 게시판 글쓰기 -->
	<div class="container">
			<form action="create" method="post">
				<table>
					<thead>
						<tr>
							<th colspan="2">게시글 작성</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th>글 제목<i style="color: red">*</i></th>
							<td><input type="text" name="title"><br></td>
						</tr>
<!-- 						<tr> -->
<!-- 							<td colspan="2"><p></p></td> -->
<!-- 						</tr> -->
						<tr>
							<th>작성 일자</th>
							<td>
								<input type="text" name="cdate" value="<%= sf.format(nowDate) %>" disabled>
							</td>
						</tr>
						<tr>
							<th>글쓴이</th>
							<td><input type="text" name="writer" value="혜징" readonly></td>
						</tr>
<!-- 						<tr> -->
<!-- 							<td colspan="2"><p></p></td> -->
<!-- 						</tr> -->
						<tr>
							<th>글내용<i style="color: red">*</i></th>
							<td><textarea class="form-control"
									placeholder="내용을 입력하세요" name="content" maxlength="2048"
									style="height: 350px;"></textarea></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" class="btn btn-primary pull-right" value="작성">
			</form>		
	</div>

</body>
</html>