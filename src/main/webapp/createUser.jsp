<%@page import="java.sql.Date"%>
<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>회원가입</title>
</head>
<body>
	<center>
		<h1>회원가입</h1>
		<hr>
		<form action="createUser.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">아이디</td>
					<td align="left"><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td align="left"><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">이메일</td>
					<td align="left"><input type="text" name="email"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">이미지</td>
					<td align="left"><select name="image">
						<option value="none">none</option>
						</select></td>
				</tr>
				<tr>
					<td bgcolor="orange">이름</td>
					<td align="left"><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">생년월일</td>
					<td align="left"><input type="text" name="birth2"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">전화번호</td>
					<td align="left"><input type="text" name="phone"/></td>
				</tr>

				<tr>
					<td bgcolor="orange">우편번호</td>
					<td align="left"><input type="text" name="post"/></td>
				</tr>				
				<tr>
					<td bgcolor="orange">주소</td>
					<td align="left"><select name="address">
						<option value="null">null</option>
						</select></td>
				</tr>				
				<tr>
					<td bgcolor="orange">등급</td>
					<td align="left"><select name="role">
						<option value="Admin">Admin</option>
						<option value="User">User</option>					
					</select></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="가입하기 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="index.jsp">메인 화면으로</a>
	</center>
</body>
</html>