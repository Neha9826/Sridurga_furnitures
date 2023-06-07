package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import ski.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Sri Durga Furniture</title>\n");
      out.write("\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">-->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style2.css\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<header class=\"about-bg\">\n");
      out.write("\t<nav>\n");
      out.write("\t\t<div class=\"row-m clearfix\">\n");
      out.write("\t\t\t<img class=\"logo\" src=\"images/logo2.png\">\n");
      out.write("\t\t\t<ul class=\"main-nav animated slideInDown\" id=\"check-class\">\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t    <li><a href=\"service.jsp\">Services</a></li>\n");
      out.write("\t\t\t    <li><a href=\"project.jsp\">Projects</a></li>\n");
      out.write("\t\t\t    <li><a href=\"about.jsp\">About us</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<a href=\"#\" class=\"mob-icon\" onClick=\"slidShow()\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-bars\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<div class=\"head-content\">\n");
      out.write("\t   <h1><span class=\"blink\">SRI DURGA FURNITURE WORKS</span>.</h1>\n");
      out.write("\t   <h2>THEY SAY HOME IS WHERE THE HEART IS.</h2>\n");
      out.write("\t   <h3>WE SAY THE HEART IS HOME WHEREIN ALL YOUR FURNITURE IS MADE TO CHERISH.</h3>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</header><hr>\n");
      out.write("\n");
      out.write("<div class=\"fworks\">\n");
      out.write("\t\n");
      out.write("\t\t<table class=\"fwtext\" border=\"0\" bordercolor=\"#fff\" align=\"center\" cellspacing=\"15px\">\n");
      out.write("\t\t<th colspan=\"3\">\n");
      out.write("\t\t\t<h1 class=\"fw-head\">About Us</h1>\n");
      out.write("\t\t</th>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td rowspan=\"2\" class=\"a-img\"><img class=\"contimg\" src=\"images/gallery-img3.jpg\"></td>\n");
      out.write("\t\t\t\t<td class=\"ta\">Our Story</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"a-content\" align=\"justify\">\n");
      out.write("                                    They say home is where the heart is.Taking this further, we say the heart is home wherein all your furniture is made to cherish.We; at Sri Durga Furniture Works, have been at the forefront of the industry creating beautiful spaces for you within your homes and offices since 1985.\n");
      out.write("                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"a-content\" align=\"justify\" colspan=\"3\">\n");
      out.write("                                With a successful start by importing our furniture we came up with our own factories that manufactures Sofas, Beds and Chairs. We are humbled to have touched the lives of thousands of people with our range of world class home and office furniture, innovative laminates, sturdy designer doors, exquisite veneers and top-grade plywood. <br><br>\n");
      out.write("                               From being the pioneers in veneer business to being the leading furniture company and a lifestyle brand we have come a long way since then and the journey, so far, has been an enriching and memorable one.<br><br>\n");
      out.write("With our state of the art production facilities that make everything ranging from ply, laminates, veneers to sofas, chairs, beds, tables along with a whole lot more. We have scaled up our growth exponentially. This is the relentless pursuit of our vision to be one of the best interior solution providers that has made what Sri Durga is today.\n");
      out.write("<br><br>\n");
      out.write("With the advent of our new Modular Factory we have undertaken orders for institutional offices across India with some of our most prominent clients being stalwarts of the public and private sectors. Having tasted success with many turnkey projects it is our ambition to be the primary provider for premium office desking and shelving systems across India.\n");
      out.write("By challenging the way we see and do things leads us to new ideas that inspire innovations for our partners.<br><br>\n");
      out.write("We process a plethora of orders both big and small for a huge selection of materials and furniture. From happy clients in businesses to happy homes for our customers, we process a multitude of orders everyday. A dedicated team works for every platform we cater to like Institutional sales, Retail and Ecommerce.\n");
      out.write("<br><br>\n");
      out.write("It is our belief that when you purchase a piece of furniture you are creating an experience, a memory. And it is these experiences we strive to create for our valuable customers. We have received immense love from them and we strive to bring them new experiences everyday.\n");
      out.write("<br><br>\n");
      out.write("<h4>We believe in:</h4>\n");
      out.write("<br>\n");
      out.write("<h4>PASSION :</h4>\n");
      out.write("We dare to dream, we always aim higher. By constantly setting new standards in who we are and what we do, our passion will spur us on.\n");
      out.write("<br><br>\n");
      out.write("<h4>PARTNERSHIP :</h4>\n");
      out.write("We work as a team with mutual trust and shared accountability towards a common goal in a collaborative environment, to meet the needs and expectations of all stakeholders. We always stand behind our promises and act with complete integrity.\n");
      out.write("<br><br>\n");
      out.write("<h4>INNOVATION :</h4>\n");
      out.write("We are constantly seeking to exceed our previous best, with creativity and imagination. By challenging the way we see and to things, it leads to fresh perspectives and new ideas that inspire business innovation drive sustainable efficiencies and deliver superior product offerings.\n");
      out.write("<br><br>\n");
      out.write("<h4>What makes us different?</h4>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<h4>WHITE GLOVE Delivery :</h4> We provide expert technicians to assemble your furniture with care in select cities.\n");
      out.write("<br><br>\n");
      out.write("<h4>FREE Installation :</h4> We help you assemble your furniture free of cost.\n");
      out.write("<br><br>\n");
      out.write("<h4>EASY Pay :</h4> With Easy Payment Options like Cash on Delivery and EMI, shopping is more convenient. \n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</table>\n");
      out.write("</div><hr>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <table class=\"main-tbl\" border=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<th colspan=\"2\">Contact us</th>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<table class=\"address\" border=\"0\">\n");
      out.write("\t\t\t\t<tr >\n");
      out.write("\t\t\t\t\t<th>Address</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("        ");

                    Connection con = ski.MyConnection.getConnection();
                    PreparedStatement st = con.prepareStatement("Select * from address ");
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                    
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>\n");
      out.write("                            <h2>");
      out.print(rs.getString("sname"));
      out.write("</h2>\n");
      out.write("\t\t\t<h4>");
      out.print(rs.getString("desc1"));
      out.write("<br><br>\n");
      out.write("\t\t\t");
      out.print(rs.getString("desc2"));
      out.write("\n");
      out.write("\t\t\t</h4><br>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t");
      out.print(rs.getString("adrs"));
      out.write("<br>\n");
      out.write("\t\t\t");
      out.print(rs.getString("loc"));
      out.write("\n");
      out.write("\t\t\t</h3><br>\n");
      out.write("\t\t\t<h4>\n");
      out.write("\t\t\t");
      out.print(rs.getString("mail"));
      out.write("<br>\n");
      out.write("\t\t\t");
      out.print(rs.getString("phn"));
      out.write("\n");
      out.write("\t\t\t</h4>\t\n");
      out.write("                        ");

                    }
                    con.close();
                    
      out.write("\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<table class=\"feed\" border=\"0\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th height=\"26px\" colspan=\"2\">Feedback</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<form name=\"frm\" action=\"submit.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t<tr><h2>\n");
      out.write("\t\t\t\t\t<td class=\"lbl\">*Name:</td>\n");
      out.write("\t\t\t\t\t<td class=\"input\"><input type=\"text\" name=\"uname\" required placeholder=\"eg: Mr/Miss xyz\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"lbl\">*Email:</td>\n");
      out.write("\t\t\t\t\t<td class=\"input\"><input type=\"email\" name=\"id\" required placeholder=\"eg: abc01@gmail.com\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"lbl\">*Phone &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; no:</td>\n");
      out.write("\t\t\t\t\t<td class=\"input\"><input type=\"number\" name=\"number\" required maxlength=\"12\" placeholder=\"eg: +91 9876543210\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"lbl\">Messege:</td>\n");
      out.write("\t\t\t\t\t<td class=\"input\"><textarea class=\"txt-area\" rows=\"4\" cols=\"35\" name=\"mesg\"></textarea></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"btn-td\" colspan=\"2\"><input onClick=\"sendMsg()\" class=\"btn\" type=\"submit\" name=\"btn\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                </h2> </form>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"footer-a\">\n");
      out.write("<table>\n");
      out.write("\t<tr>\n");
      out.write("\t <td>\n");
      out.write("\t   <table class=\"ftable\" align=\"center\" border=\"0\" cellspacing=\"7px\">\n");
      out.write("\t\t<tr align=\"center\">\n");
      out.write("\t\t\t<td><a href=\"www.facebook.com\"><img class=\"fimg\" src=\"images/Facebook.png\"></a></td>\n");
      out.write("\t\t\t<td><a href=\"www.instagram.com\"><img class=\"fimg\" src=\"images/Instagram.png\"></a></td>\n");
      out.write("\t\t\t<td><a href=\"www.twitter.com\"><img class=\"fimg\" src=\"images/Twitter.png\"></a></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t   </table>\n");
      out.write("\t </td>\n");
      out.write("\t <td>\n");
      out.write("\t \t<table class=\"ad-go\">\n");
      out.write("\t \t  <tr>\n");
      out.write("\t\t\t  <td><a href=\"adminlogin.jsp\"><img class=\"faimg\" src=\"images/switch1.png\"></a></td>\n");
      out.write("\t \t  </tr>\n");
      out.write("\t \t</table>\n");
      out.write("\t </td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction slidShow()\n");
      out.write("\t{\n");
      out.write("\t\tvar x = document.getElementById('check-class');\n");
      out.write("\t\tif(x.style.display === \"none\")\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tx.style.display=\"block\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\t{\n");
      out.write("\t\t\tx.style.display=\"none\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction sendMsg()\n");
      out.write("        {\n");
      out.write("           alert( $(\"#msg\").text(\"Thank you \" + $(\"#uname\").val() + \n");
      out.write("                    \" for your time. Your messege has been successfully submited.\"));\n");
      out.write("        }\n");
      out.write("</script>\n");
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
