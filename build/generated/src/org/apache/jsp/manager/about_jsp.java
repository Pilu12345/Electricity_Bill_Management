package org.apache.jsp.manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>LuXe</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"../images/logo.png\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body,h1,h2,h3,h4,h5,h6 {font-family: \"Raleway\", Arial, Helvetica, sans-serif}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("\n");
      out.write("<!-- Navigation Bar -->\n");
      out.write("<div class=\"w3-bar w3-white w3-large\">\n");
      out.write("  <a href=\"home.jsp\" class=\"w3-bar-item w3-button  w3-mobile\"><img src=\"../images/logo.png\" style=\"width: 25px;height: 25px;\"></a>\n");
      out.write("  <a href=\"allrequests.jsp\" class=\"w3-bar-item w3-button w3-mobile\">All Requests</a>\n");
      out.write("  <a href=\"rooms.jsp\" class=\"w3-bar-item w3-button w3-mobile\">Rooms</a>\n");
      out.write("  <a href=\"about.jsp\" class=\"w3-bar-item w3-button w3-blue w3-mobile\">About</a>\n");
      out.write("  <a href=\"contact.jsp\" class=\"w3-bar-item w3-button w3-mobile\">Contact</a>\n");
      out.write("  <a href=\"../logout.jsp\" id=\"user_name_div\" title=\"logout\" class=\"w3-bar-item w3-button w3-right w3-light-grey w3-mobile\">");
      out.print( session.getAttribute( "LogedInManagerName" ) );
      out.write("</a>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    var pp = document.getElementById('user_name_div').innerText;\n");
      out.write("    if(pp == \"null\"){\n");
      out.write("      window.location.href = \"../login.jsp\";\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div style=\"width: 100%; min-height: 750px;\">\n");
      out.write("<div class=\"w3-row-padding\" id=\"about\">\n");
      out.write("    <div class=\"w3-col l4 12\">\n");
      out.write("      <h3>About</h3>\n");
      out.write("      <h6>welcome to the Best Hotel in bhubaneswar</h6>\n");
      out.write("    <p>We accept: <i class=\"fa fa-credit-card w3-large\"></i> <i class=\"fa fa-cc-mastercard w3-large\"></i> <i class=\"fa fa-cc-amex w3-large\"></i> <i class=\"fa fa-cc-cc-visa w3-large\"></i><i class=\"fa fa-cc-paypal w3-large\"></i></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col l8 12\">\n");
      out.write("      \n");
      out.write("      <img src=\"../images/map.jpg\" class=\"w3-image w3-greyscale\" style=\"width:100%;\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-row-padding w3-large w3-center\" style=\"margin:32px 0\">\n");
      out.write("    <div class=\"w3-third\"><i class=\"fa fa-map-marker w3-text-blue\"></i> Bhubaneswar, Khurda, 752050</div>\n");
      out.write("    <div class=\"w3-third\"><i class=\"fa fa-phone w3-text-blue\"></i> Phone: +91 9776466489</div>\n");
      out.write("    <div class=\"w3-third\"><i class=\"fa fa-envelope w3-text-blue\"></i> Email: sdas74267@gmail.com</div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"w3-panel w3-blue w3-leftbar w3-padding-32\">\n");
      out.write("    <h6><i class=\"fa fa-info w3-light-grey w3-padding w3-margin-right\"></i> On demand, we can offer playstation, babycall, children care, dog equipment, etc.</h6>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"w3-container\">\n");
      out.write("    <h3>Our Hotels</h3>\n");
      out.write("    <h6>You can find our hotels anywhere in the world:</h6>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-row-padding w3-padding-16 w3-text-white w3-large\">\n");
      out.write("    <div class=\"w3-half w3-margin-bottom\">\n");
      out.write("      <div class=\"w3-display-container\">\n");
      out.write("        <img src=\"../images/cinqueterre.jpg\" alt=\"Cinque Terre\" style=\"width:100%\">\n");
      out.write("        <span class=\"w3-display-bottomleft w3-padding\">Cinque Terre</span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-half\">\n");
      out.write("      <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("        <div class=\"w3-half w3-margin-bottom\">\n");
      out.write("          <div class=\"w3-display-container\">\n");
      out.write("            <img src=\"../images/newyork2.jpg\" alt=\"New York\" style=\"width:100%\">\n");
      out.write("            <span class=\"w3-display-bottomleft w3-padding\">New York</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-half w3-margin-bottom\">\n");
      out.write("          <div class=\"w3-display-container\">\n");
      out.write("            <img src=\"../images/sanfran.jpg\" alt=\"San Francisco\" style=\"width:100%\">\n");
      out.write("            <span class=\"w3-display-bottomleft w3-padding\">San Francisco</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("        <div class=\"w3-half w3-margin-bottom\">\n");
      out.write("          <div class=\"w3-display-container\">\n");
      out.write("            <img src=\"../images/pisa.jpg\" alt=\"Pisa\" style=\"width:100%\">\n");
      out.write("            <span class=\"w3-display-bottomleft w3-padding\">Pisa</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-half w3-margin-bottom\">\n");
      out.write("          <div class=\"w3-display-container\">\n");
      out.write("            <img src=\"../images/paris.jpg\" alt=\"Paris\" style=\"width:100%\">\n");
      out.write("            <span class=\"w3-display-bottomleft w3-padding\">Paris</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"w3-container w3-padding-32 w3-black w3-opacity w3-card w3-hover-opacity-off\" style=\"margin:32px 0;\">\n");
      out.write("    <h2>Get the best offers first!</h2>\n");
      out.write("    <p>Join our newsletter.</p>\n");
      out.write("    <label>E-mail</label>\n");
      out.write("    <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Your Email address\">\n");
      out.write("    <button type=\"button\" class=\"w3-button w3-blue w3-margin-top\">Subscribe</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-padding-16 w3-black w3-center w3-margin-top\">\n");
      out.write("  <h5>Find Us On</h5>\n");
      out.write("  <div class=\"w3-xlarge w3-padding-16\">\n");
      out.write("    <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("\n");
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
