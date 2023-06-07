<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ski.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String uname = request.getParameter("uname");
        String id = request.getParameter("id");
        String number = request.getParameter("number");
        String mesg = request.getParameter("mesg");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/sridurga", "root", "");
        PreparedStatement st = con.prepareStatement
                            ("Insert into user values(?,?,?,?)");
        st.setString(1, uname);
        st.setString(2, id);
        st.setString(3, number);
        st.setString(4, mesg);
        
        st.execute();
        
        con.close();
    %>
    <h1 align="center">
        Thank you <%=uname%> for your time. Your Message has been successfully submitted.
    </h1>
    <h3><a href="about.jsp">
        BACK
        </a></h3>
    </body>
</html>
