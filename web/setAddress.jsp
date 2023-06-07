<%@page import="java.sql.*, ski.*" contentType="text/html" pageEncoding="UTF-8"%>

      <%
        PreparedStatement st = null;
        String sname = request.getParameter("sname");
        String desc1 = request.getParameter("desc1");
        String desc2 = request.getParameter("desc2");
        String adrs = request.getParameter("adrs");
        String loc = request.getParameter("loc");
        String mail = request.getParameter("mail");
        String phn = request.getParameter("phn");
        String ad = "update address set sname=?, desc1=?, desc2=?, adrs=?, loc=?, mail=?, phn=?";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/sridurga", "root", "");
        try{
        st = con.prepareStatement(ad);
        st.setString(1, sname);
        st.setString(2, desc1);
        st.setString(3, desc2);
        st.setString(4, adrs);
        st.setString(5, loc);
        st.setString(6, mail);
        st.setString(7, phn);
        st.executeUpdate();
        response.sendRedirect("adminhome.jsp?x=1");
        con.close();
    
     }
            catch(SQLException ex)
            {
                %>
                <h1>There's something wrong. Please try again.</h1>
                <a href="adminhome.jsp?y=1">Click here to try again</a>
                <%
            }
            
        %>