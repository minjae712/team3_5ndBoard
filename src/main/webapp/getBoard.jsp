<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세</title>
</head>
<body>
	<center>
		<%@ include file="/menuBar.jsp" %>
		<h1><b>자유 게시판</b></h1>
		<hr>
		<div style="width: 70%">
			<table class="table table-bordered" >
				<tr>
					<td colspan="1">제목</td>
					<td colspan="5">${board.title}</td>
				</tr>
				<tr>
					<td>게시글번호</td>
					<td colspan="6">${board.no}</td>
				</tr>
				<tr>
					<td colspan="1">작성자</td>
					<td colspan="1">${board.writer}</td>
					<td colspan="1">등록일</td>
					<td colspan="1">${board.regDate}</td>
					<td colspan="1">조회수</td>
					<td colspan="1">${board.cnt}</td>
				</tr>
				<tr>
					<td colspan="6" height="400">${board.content}</td>
				</tr>
			</table>
		</div>
		<hr>
		<a class="btn btn-default" href="updateBoard.jsp">글수정</a>&nbsp;&nbsp;&nbsp; 
		<a class="btn btn-default" href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a class="btn btn-default" href="deleteBoard.do?no=${board.no}">글삭제</a>&nbsp;&nbsp;&nbsp;
		<a class="btn btn-default" href="getBoardList.do">글목록</a>
	</center>
</body>
</html>
