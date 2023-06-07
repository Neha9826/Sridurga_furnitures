<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ski.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Untitled Document</title>
<link rel="stylesheet" type="text/css" href="adstyle.css">
</head>

<body>
<header>
	<div class="header">
            <h1>Welcome dear admin<span class="blink"> <%=request.getParameter("n")%> </span> .</h1>
		<div class="nav">
			<ul>
				<li><a href="#admin-reg">Admin Update</a></td>
				<li><a href="#address">Edit Address</a></td>
				<li><a href="#cust">Customer Details</a></td>
				<li><a href="logout.jsp">Logout</a></td>
			</ul>
		</vid>
	</div>
</header>
	<div class="ad-update">
            
		<a name="admin-reg"></a><h2 align="center">Admin Update</h2>
		<form name="frm1" method="post" action="adminUpdate.jsp">
		<table>
			<tr>
			<td>
				Admin Id:<input type="email" name="id" >
			</td>
			</tr>
			<tr>
			<td>
				Password:<input type="password" name="pwd" >
			</td>
			</tr>
                        <%
                    if(request.getParameter("x") != null)
                    {
                        out.println("<tr><td colspan='3'> Id or password has been changed successfully.</td></tr>");
                    }
                    %>
                        <tr>
                            <td><input type="submit" value="Update"></td>
                        </tr>
		</table>
                </form>
	</div>
	<div class="adrs">
		<a name="address"></a><h2 align="center">Edit Address</h2>
		<form name="frm4" method="post" action="setAddress.jsp">
			<table>
				<tr>
                                <td>Name:</td>
                                <td><textarea name="sname"></textarea></td>
				</tr>
				<tr>
                                <td>Description1:</td>
                                <td><textarea name="desc1"></textarea></td>
				</tr>
				<tr>
                                <td>Description2:</td>
                                <td><textarea name="desc2"></textarea></td>
				</tr>
				<tr>
                                <td>Address:</td>
                                <td><textarea name="adrs"></textarea></td>
				</tr>
				<tr>
                                <td>Location:</td>
                                <td><textarea name="loc"></textarea></td>
				</tr>
				<tr>
                                <td>Email:</td>
                                <td><textarea name="mail"></textarea></td>
				</tr>
				<tr>
                                <td>Phone no:</td>
                                <td><textarea name="phn"></textarea></td>
				</tr>
                                <%
                    if(request.getParameter("x") != null)
                    {
                        out.println("<tr><td colspan='3'>You have successfully changed the address.</td></tr>");
                    }
                    else if(request.getParameter("y") != null)
                    {
                        out.println("<tr><td colspan='3'>There's something wrong. Fill again.</td></tr>");
                    }
                    %>
				<tr>
                                <td><input type="submit" value="SET"></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="customer">
            <form name="cust-frm" method="post" action="deleteCust.jsp">
		<a name="cust"></a><h2 align="center">Customer Detail</h2>
                <table cellspacing="10px" cellpadding="5px" border="1">
                    <tr>
                        <th colspan="5">Customer Details</th>
                    </tr>
                    
                    <tr>
                    <td>Name</td>
                    <td>Id</td>
                    <td>Number</td>
                    <td>Message</td>
                    </tr>
                    
                    <%
                    Connection con = ski.MyConnection.getConnection();
                    PreparedStatement st = con.prepareStatement("Select * from user ");
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                    %>
                    
                    <tr>
                    <td><%=rs.getString("uname")%> </td>
                    <td><%=rs.getString("id")%> </td>
                    <td><%=rs.getString("number")%> </td>
                    <td><%=rs.getString("mesg")%> </td>
                    </tr>
                    
                    <%
                    }
                    con.close();
                    %>
		</table>
            </form>
	</div>
</body>
</html>