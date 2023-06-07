package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Sri Durga Furniture</title>\n");
      out.write("\n");
      out.write("<!-- Start WOWSlider.com HEAD section -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\n");
      out.write("<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("<table border=\"0\" class=\"header\">\n");
      out.write("<tr>\n");
      out.write("\t<td rowspan=\"6\" class=\"logo\"><img src=\"images/logo1.jpg\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr height=\"130px\"></tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t <div class=\"nav\">\n");
      out.write("\t\t      <ul>\n");
      out.write("\t\t\t     <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t     <li><a href=\"service.jsp\">Services</a></li>\n");
      out.write("\t\t\t     <li><a href=\"project.jsp\">Projects</a></li>\n");
      out.write("\t\t\t     <li><a href=\"about.jsp\">About us</a></li>\n");
      out.write("\t\t      </ul>\n");
      out.write("\t     </div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("<div class=\"slider\">\n");
      out.write("\t\n");
      out.write("\t<!-- Start WOWSlider.com BODY section -->\n");
      out.write("<div id=\"wowslider-container1\">\n");
      out.write("<div class=\"ws_images\"><ul>\n");
      out.write("\t\t<li><img src=\"data1/images/slide.jpg\" alt=\"Sri\" title=\"Sri\" id=\"wows1_0\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/slide3.jpg\" alt=\"Durga\" title=\"Durga\" id=\"wows1_1\"/></li>\n");
      out.write("\t\t<li><a href=\"http://wowslider.net\"><img src=\"data1/images/slide1.jpg\" alt=\"html5 slideshow\" title=\"Furniture\" id=\"wows1_2\"/></a></li>\n");
      out.write("\t\t<li><img src=\"data1/images/slide2.jpg\" alt=\"Works\" title=\"Works\" id=\"wows1_3\"/></li>\n");
      out.write("\t</ul></div>\n");
      out.write("\t<div class=\"ws_bullets\"><div>\n");
      out.write("\t\t<a href=\"#\" title=\"Sri\"><span><img src=\"data1/tooltips/slide.jpg\" alt=\"Sri\"/>1</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"Durga\"><span><img src=\"data1/tooltips/slide3.jpg\" alt=\"Durga\"/>2</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"Furniture\"><span><img src=\"data1/tooltips/slide1.jpg\" alt=\"Furniture\"/>3</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"Works\"><span><img src=\"data1/tooltips/slide2.jpg\" alt=\"Works\"/>4</span></a>\n");
      out.write("\t</div></div><div class=\"ws_script\" style=\"position:absolute;left:-99%\"><a href=\"http://wowslider.net\">javascript slideshow</a> by WOWSlider.com v9.0</div>\n");
      out.write("<div class=\"ws_shadow\"></div>\n");
      out.write("</div>\t\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/wowslider.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/script.js\"></script>\n");
      out.write("<!-- End WOWSlider.com BODY section -->\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div align=\"center\" class=\"text\">\n");
      out.write("\t<h1><h1><h1 class=\"ta\" align=\"center\">Welcome!</h1></h1></h1>\n");
      out.write("\t<h2 align=\"center\" class=\"tb\">Our company offers you the best design solutions to make your home interior unique and stylish.</h2>\n");
      out.write("</div>\n");
      out.write("</header><hr>\n");
      out.write("<div class=\"fworks\">\n");
      out.write("\t\n");
      out.write("\t\t<table class=\"fwtext\" border=\"0\" align=\"center\" cellspacing=\"15px\">\n");
      out.write("\t\t<th colspan=\"3\">\n");
      out.write("\t\t\t<h1 fw-head>Featured Works</h1>\n");
      out.write("\t\t</th>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><img class=\"contimg\" src=\"images/gallery-img3.jpg\"></td>\n");
      out.write("\t\t\t\t<td><img class=\"contimg\" src=\"images/page2_img6.jpg\"></td>\n");
      out.write("\t\t\t\t<td><img class=\"contimg\" src=\"images/office3.jpg\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><img class=\"contimg\" src=\"images/office2.jpg\"></td>\n");
      out.write("\t\t\t\t<td><img class=\"contimg\" src=\"images/office.jpg\"></td>\n");
      out.write("\t\t\t\t<td><img class=\"contimg\" src=\"images/gallery-img2.jpg\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer-a\">\n");
      out.write("\t<table class=\"ftable\" align=\"center\" border=\"0\" cellspacing=\"7px\">\n");
      out.write("\t\t<tr align=\"center\">\n");
      out.write("\t\t\t<td><a href=\"www.facebook.com\"><img class=\"fimg\" src=\"images/Facebook.png\"></a></td>\n");
      out.write("\t\t\t<td><a href=\"www.instagram.com\"><img class=\"fimg\" src=\"images/Instagram.png\"></a></td>\n");
      out.write("\t\t\t<td><a href=\"www.twitter.com\"><img class=\"fimg\" src=\"images/Twitter.png\"></a></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</div> \n");
      out.write("\n");
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
