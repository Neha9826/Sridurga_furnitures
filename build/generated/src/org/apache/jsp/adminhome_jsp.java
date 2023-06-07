package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import ski.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Frameset//EN\" \"http://www.w3.org/TR/REC-html40/frameset.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"header\">\n");
      out.write("            <h1>Welcome dear admin ");
      out.print(session.getAttribute("aname"));
      out.write(" .</h1>\n");
      out.write("\t\t<table class=\"menu\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><a href=\"#admin-reg\">Admin Update</a></td>\n");
      out.write("\t\t\t\t<td><a href=\"#address\">Edit Address</a></td>\n");
      out.write("\t\t\t\t<td><a href=\"#cust\">Customer Details</a></td>\n");
      out.write("\t\t\t\t<td><a href=\"logout.jsp\">Logout</a></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ad-update\">\n");
      out.write("            \n");
      out.write("\t\t<a name=\"admin-reg\"></a><h2 align=\"center\">Admin Update</h2>\n");
      out.write("\t\t<form name=\"frm1\" method=\"post\" action=\"adminUpdate.jsp\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("                            Admin Name:<input type=\"text\" name=\"aname\" id=\"name\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\tAdmin Id:<input type=\"email\" name=\"aid\" id=\"id\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\tPassword:<input type=\"password\" name=\"apwd\" id=\"pwd\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Update\"></td>\n");
      out.write("                        </tr>\n");
      out.write("\t\t</table>\n");
      out.write("                </form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"adrs\">\n");
      out.write("\t\t<a name=\"address\"></a><h2 align=\"center\">Edit Address</h2>\n");
      out.write("\t\t<form name=\"frm4\" method=\"post\" action=\"setAddress.jsp\">\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td>Name:</td>\n");
      out.write("                                <td><textarea name=\"t1\" id=\"t1\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td>Description1:</td>\n");
      out.write("                                <td><textarea name=\"t2\" id=\"t2\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td>Description2:</td>\n");
      out.write("                                <td><textarea name=\"t3\" id=\"t3\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td>Address:</td>\n");
      out.write("                                <td><textarea name=\"t4\" id=\"t4\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td>Location:</td>\n");
      out.write("                                <td><textarea name=\"t5\" id=\"t5\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td>Email:</td>\n");
      out.write("                                <td><textarea name=\"t6\" id=\"t6\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td>Phone no:</td>\n");
      out.write("                                <td><textarea name=\"t7\" id=\"t7\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                <td><input type=\"submit\" value=\"SET\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"customer\">\n");
      out.write("            <form name=\"cust-frm\" method=\"post\" action=\"deleteCust.jsp\">\n");
      out.write("\t\t<a name=\"cust\"></a><h2 align=\"center\">Customer Detail</h2>\n");
      out.write("                <table cellspacing=\"10px\" cellpadding=\"5px\" border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"5\">Customer Details</th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>Id</td>\n");
      out.write("                    <td>Number</td>\n");
      out.write("                    <td>Messege</td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");

                    Connection con = ski.MyConnection.getConnection();
                    PreparedStatement st = con.prepareStatement("Select * from user ");
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString("uname"));
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(rs.getString("id"));
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(rs.getString("number"));
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(rs.getString("mesg"));
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");

                    }
                    con.close();
                    
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("            </form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
