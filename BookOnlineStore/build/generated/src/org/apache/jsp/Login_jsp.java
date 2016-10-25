package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Login.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <!-- Mixins-->\n");
      out.write("                <!-- Pen Title-->\n");
      out.write("                <div class=\"pen-title\">\n");
      out.write("                    <h1 style=\"color: red; font-weight: bold\">Book Store</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"card\"></div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h1 class=\"title\">Login</h1>\n");
      out.write("                        <form action=\"LoginCustomer\" method=\"post\">\n");
      out.write("                            <div class=\"input-container\">\n");
      out.write("                                <input type=\"text\" id=\"Email\" name=\"email\" required=\"required\"/>\n");
      out.write("                                <label for=\"Email\">Email</label>\n");
      out.write("                                <div class=\"bar\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-container\">\n");
      out.write("                                <input type=\"password\" id=\"Password\" name=\"password\" required=\"required\"/>\n");
      out.write("                                <label for=\"Password\">Password</label>\n");
      out.write("                                <div class=\"bar\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"text-align: center;margin-bottom: 20px;font-size: 18px;color: red\">\n");
      out.write("                                ");
if (request.getAttribute("messageLogin") != null) {
                                
      out.write("\n");
      out.write("                                ");
      out.print(request.getAttribute("messageLogin"));
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"button-container\">\n");
      out.write("                                <button><span>Go</span></button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"footer\"><a href=\"#\">Forgot your password?</a></div>\n");
      out.write("                            <div class=\"footer1\" style=\"font-weight: 500\">If you're not member please <a href=\"#\"><span style=\"color: red; font-weight: bolder\">Register</span></a></div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card alt\">\n");
      out.write("                        <div class=\"toggle\"></div>\n");
      out.write("                        <h1 class=\"title\">Register\n");
      out.write("                            <div class=\"close\"></div>\n");
      out.write("                        </h1>\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"input-container\">\n");
      out.write("                                <input type=\"text\" id=\"Email\" required=\"required\"/>\n");
      out.write("                                <label for=\"Email\">Email</label>\n");
      out.write("                                <div class=\"bar\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-container\">\n");
      out.write("                                <input type=\"password\" id=\"Password\" required=\"required\"/>\n");
      out.write("                                <label for=\"Password\">Password</label>\n");
      out.write("                                <div class=\"bar\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-container\">\n");
      out.write("                                <input type=\"password\" id=\"Repeat Password\" required=\"required\"/>\n");
      out.write("                                <label for=\"Repeat Password\">Repeat Password</label>\n");
      out.write("                                <div class=\"bar\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"button-container\">\n");
      out.write("                                <button><span>Next</span></button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Portfolio--><a id=\"portfolio\" href=\"http://pkshopy.com/farooqshad/\" title=\"View my portfolio!\"><i class=\"fa fa-link\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"js/Login.js\"></script>\n");
      out.write("    </body>\n");
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
