package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>LuXe</title>\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"images/logo.png\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    body {\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        background-color: #ddd;\n");
      out.write("        font-family: sans-serif;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h1 {\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0 0 20px;\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 30px;\n");
      out.write("        color: darkgray;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox {\n");
      out.write("        width: 320px;\n");
      out.write("        height: 550px;\n");
      out.write("        background-color: white;\n");
      out.write("        color: #fff;\n");
      out.write("        top: 50%;\n");
      out.write("        left: 50%;\n");
      out.write("        position: absolute;\n");
      out.write("        transform: translate(-50%, -50%);\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        padding: 70px 30px;\n");
      out.write("        border-radius: 20px;\n");
      out.write("        box-shadow: 5px 10px #888888;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .avatar {\n");
      out.write("        width: 50px;\n");
      out.write("        height: 50px;\n");
      out.write("        border-radius: 50%;\n");
      out.write("        position: absolute;\n");
      out.write("        top: -50px;\n");
      out.write("        left: calc(50% - 50px);\n");
      out.write("        background-color: DodgerBlue;\n");
      out.write("        padding: 25px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    .loginbox p {\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        font-weight: bold;\n");
      out.write("        color: darkgray;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox input {\n");
      out.write("        width: 100%;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox input[type=\"text\"],\n");
      out.write("    input[type=\"password\"],\n");
      out.write("    input[type=\"email\"] {\n");
      out.write("        border: none;\n");
      out.write("        border-bottom: 1px solid darkgray;\n");
      out.write("        background: transparent;\n");
      out.write("        outline: none;\n");
      out.write("        height: 40px;\n");
      out.write("        color: darkgray;\n");
      out.write("        font-size: 16px;\n");
      out.write("        transition: 0.25s;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox input[type=\"text\"]:focus,\n");
      out.write("    input[type=\"password\"]:focus,\n");
      out.write("    input[type=\"email\"]:focus {\n");
      out.write("        border-bottom: 2px solid #ffc107;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox input[type=\"submit\"] {\n");
      out.write("        border: none;\n");
      out.write("        outline: none;\n");
      out.write("        height: 40px;\n");
      out.write("        background: DodgerBlue;\n");
      out.write("        color: #fff;\n");
      out.write("        font-size: 18px;\n");
      out.write("        border-radius: 20px;\n");
      out.write("        transition: 0.25s;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox input[type=\"submit\"]:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("        background: #ffc107;\n");
      out.write("        color: #000;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox a {\n");
      out.write("        text-decoration: none;\n");
      out.write("        font-size: 12px;\n");
      out.write("        line-height: 20px;\n");
      out.write("        color: darkgrey;\n");
      out.write("        transition: 0.25s;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .loginbox a:hover {\n");
      out.write("        color: #ffc107;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .error {\n");
      out.write("        color: #FF7800;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ::placeholder {\n");
      out.write("        color: #ddd;\n");
      out.write("        opacity: 1;\n");
      out.write("        /* Firefox */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    :-ms-input-placeholder {\n");
      out.write("        /* Internet Explorer 10-11 */\n");
      out.write("        color: #ddd;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ::-ms-input-placeholder {\n");
      out.write("        /* Microsoft Edge */\n");
      out.write("        color: #ddd;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"loginbox\"\">\n");
      out.write("        <img src=\"images/logo_white.png\" class=\"avatar\">\n");
      out.write("        <h1>Sign Up</h1>\n");
      out.write("        <form action=\"SignupServerlet\" method=\"post\">\n");
      out.write("            <p>Username</p>\n");
      out.write("            <input type=\"text\" name=\"newuser\" placeholder=\"Enter Your Username\" required=\"required\">\n");
      out.write("            <p>Password</p>\n");
      out.write("            <input type=\"password\" name=\"newpass\" placeholder=\"Enter Your Password\" required=\"required\">\n");
      out.write("            <p>Confirm Password</p>\n");
      out.write("            <input type=\"password\" name=\"newconpass\" placeholder=\"Confirm your Password\" required=\"required\">\n");
      out.write("            <p>Email</p>\n");
      out.write("            <input type=\"email\" name=\"newemail\" placeholder=\"Enter Your Email\" required=\"required\">\n");
      out.write("            <input type=\"submit\" name=\"login\" value=\"Login\"><br>\n");
      out.write("            <a href=\"login.jsp\">Already have an account?</a>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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
