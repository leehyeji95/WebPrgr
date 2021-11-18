<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.servlet.BoardDAO" %> <!-- 기본경로 /src/main/java/ -->
<%@ page import="com.servlet.BoardDTO" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<title>Build Board</title>
<link rel="stylesheet" href="./basic.css"/>
<script>
	function create() {
		location.href="BoardCreate.jsp";
	}
</script>
</head>
<body>
	<!-- 게시판 목록 -->
	<div class="container">
		<h1>게시판 목록 페이지</h1>
		<button onclick="create();">글쓰기</button>
		<table>
			<tbody>
				<% 
					BoardDAO board = new BoardDAO();
					ArrayList<BoardDTO> bList = board.getList();
					for(int i=0; i<bList.size(); i++) { 
				%>
				<tr>
					<td><a href="BoardOne.jsp?bId=<%= bList.get(i).getBId()%>"><%= bList.get(i).getTitle() %></a></td>
					<td><%= bList.get(i).getWriter() %></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>

</body>
</html>