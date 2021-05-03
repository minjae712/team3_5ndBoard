<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
background-color: gray;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>
</head>
<body>
	<center>
		<h1>공지사항</h1>
		<h3>
			${user.name}님! 환영합니다...<a href="logout.do">Log-out</a>&nbsp;<a href="getBoardList.do">자유 게시판 보기</a>
		</h3>
		<table border="1" width="700">
			<tr>
				<th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="200">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="150">등록일</th>
			</tr>
			<c:forEach items="${noticeList}" var="notice">
			<tr>
				<td>${notice.no}</td>
				<td align="left"><a href="getNotice.do?uni=${notice.uni}">${notice.title}</a></td>
				<td>${notice.writer}</td>
				<td>${notice.regDate}</td>
			</tr>
			</c:forEach>
			
		</table>
		<br> <a href="insertNotice.jsp">새글 등록</a>
		<a href="changePwdForm.jsp">암호변경</a>
	</center>
</body>
</html>