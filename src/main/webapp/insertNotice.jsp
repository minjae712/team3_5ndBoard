<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
background-color: gray;
}
</style>
<title>공지등록</title>
</head>
<body>
	<center>
		<h1>공지사항 등록</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertNotice.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				
				<tr>
					<td align="left"><input type="hidden" name="no" value="공지" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left"><input type="text" value="${user.name}" name="writer" size="10" readonly="readonly" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left"><textarea name="content" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value=" 새글 등록 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getNoticeList.do">글 목록 가기</a>
	</center>
</body>
</html>