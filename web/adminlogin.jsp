<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>

</head>

<body >
<header class="adlogin-body">
<form name="frm" method="post" action="checklogin.jsp">
	<div align="center" class="login">
	<table>
		<tr>
			<th colspan="3">Admin Login</th>
		</tr>
		<tr>
			<td>ID : </td>
			<td><input type="email" name="id"></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="password" name="pwd"></td>
		</tr>
                <%
                    if(request.getParameter("x") != null)
                    {
                        out.println("<tr><td colspan='3'> Invalid UserId Or Pasword.</td></tr>");
                    }
                    %>
		<tr>
			<td colspan="3">
				<input type="submit" value="Login">
			</td>
			
		</tr>
	</table>
	</div>
</form>
</header>
</body>
</html>
