package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("<header class=\"adlogin-body\">\n");
      out.write("<form name=\"frm\" method=\"post\" action=\"checklogin.jsp\">\n");
      out.write("\t<div align=\"center\" class=\"login\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th colspan=\"3\">Admin Login</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>ID : </td>\n");
      out.write("\t\t\t<td><input type=\"email\" name=\"id\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>Password : </td>\n");
      out.write("\t\t\t<td><input type=\"password\" name=\"pwd\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                ");

                    if(request.getParameter("x") != null)
                    {
                        out.println("<tr><td colspan='3'> Invalid UserId Or Pasword.</td></tr>");
                    }
                    
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"3\">\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("</header>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
