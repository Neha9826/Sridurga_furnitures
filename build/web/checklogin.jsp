<%@page import="java.sql.*" pageEncoding="UTF-8"%>
<%@page import="ski.*"%>
        <% 
            
            String id = request.getParameter("id");
            String pwd = request.getParameter("pwd");
            Connection con = MyConnection.getConnection();
            try{
                PreparedStatement st = con.prepareStatement
                        ("select * from admin where id=? and pwd=?");
                st.setString(1, id);
                st.setString(2, pwd);
                ResultSet rs = st.executeQuery();
                if(rs.next())
                {
                    session.setAttribute("x", rs.getString("id"));
                    session.setAttribute("y", rs.getString("pwd"));
                    response.sendRedirect("adminhome.jsp?n=" +id);
                }
                else
                {
                    response.sendRedirect("adminlogin.jsp?x=1");
                }
                con.close();
              
            }
            catch(SQLException ex)
            {
                out.println(ex);
            }
            
        %>
  