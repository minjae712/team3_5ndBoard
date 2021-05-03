<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>
</head>
<body>
	<center>
		<h1>글 목록</h1>
		<h3>
			${user.name}님! 환영합니다...<a href="logout.do">Log-out</a>
		</h3>
		<form action="getBoardList.do" method="post">
			<table width="600">
				<tr>
					<td align="right">
					<select name="searchCondition">
							<c:forEach items="${conditionMap}" var="option">
								<option value="${option.value}">${option.key}
							</c:forEach>
					</select>
					<input name="searchKeyword" type="text" />
					<input type="submit" value="검색" /></td>
				</tr>
			</table>
		</form>
		
		<table border="1" width="700">
			<tr>
				<th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="200">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="150">등록일</th>
			</tr>
			<c:forEach items="${boardList}" var="board">
			<tr>
				<td>${board.no}</td>
				<td align="left"><a href="getBoard.do?no=${board.no}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.regDate}</td>
			</tr>
			</c:forEach>
			
		</table>
		<br> <a href="insertBoard.jsp">새글 등록</a>
		<a href="changePwdForm.jsp">암호변경</a>
	</center>
</body>
</html>