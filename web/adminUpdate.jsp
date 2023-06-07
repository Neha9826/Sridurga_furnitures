<%@page import="java.sql.*, java.io.* , ski.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        PreparedStatement st = null;
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        String qry = "update admin set id=?,pwd=? where no=1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/sridurga", "root", "");
        st = con.prepareStatement(qry);
        st.setString(1, id);
        st.setString(2, pwd);
        
        st.executeUpdate();
        response.sendRedirect("adminhome.jsp?x=1");
        con.close();
    %>
            
    </body>
</html>
