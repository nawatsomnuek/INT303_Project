package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>::.Book Online Store.::</title>\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Favicon and touch icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Top content -->\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("\n");
      out.write("            <div class=\"inner-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8 col-sm-offset-2 text\">\n");
      out.write("                            <h1><strong>Book Online Store</strong><br> \n");
      out.write("                                Login &amp; Register</h1>\n");
      out.write("                            <div class=\"description\">\n");
      out.write("                                <p>\n");
      out.write("                                    This is a book online store <strong>\"Please login or register\"</strong>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-box\">\n");
      out.write("                                <div class=\"form-top\">\n");
      out.write("                                    <div class=\"form-top-left\">\n");
      out.write("                                        <h3>Login to our site</h3>\n");
      out.write("                                        <p>Enter username and password to log on:</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-top-right\">\n");
      out.write("                                        <i class=\"fa fa-lock\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-bottom\">\n");
      out.write("                                    <form role=\"form\" action=\"\" method=\"post\" class=\"login-form\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-username\">Username</label>\n");
      out.write("                                            <input type=\"text\" name=\"form-username\" placeholder=\"Username...\" class=\"form-username form-control\" id=\"form-username\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-password\">Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"form-password\" placeholder=\"Password...\" class=\"form-password form-control\" id=\"form-password\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" class=\"btn\">Sign in!</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"social-login\">\n");
      out.write("                                <h3>...or login with:</h3>\n");
      out.write("                                <div class=\"social-login-buttons\">\n");
      out.write("                                    <a class=\"btn btn-link-2\" href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-facebook\"></i> Facebook\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"btn btn-link-2\" href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-twitter\"></i> Twitter\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"btn btn-link-2\" href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-google-plus\"></i> Google Plus\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-1 middle-border\"></div>\n");
      out.write("                        <div class=\"col-sm-1\"></div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-box\">\n");
      out.write("                                <div class=\"form-top\">\n");
      out.write("                                    <div class=\"form-top-left\">\n");
      out.write("                                        <h3>Sign up now</h3>\n");
      out.write("                                        <p>Fill in the form below to get instant access:</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-top-right\">\n");
      out.write("                                        <i class=\"fa fa-pencil\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-bottom\">\n");
      out.write("                                    <form role=\"form\" action=\"CustomerServlet\" method=\"post\" class=\"registration-form\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-first-name\">First name</label>\n");
      out.write("                                            <input type=\"text\" name=\"fName\" placeholder=\"First name...\" class=\"form-first-name form-control\" id=\"form-first-name\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Last name</label>\n");
      out.write("                                            <input type=\"text\" name=\"lName\" placeholder=\"Last name...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-about-yourself\">Addess</label>\n");
      out.write("                                            <textarea name=\"address\" placeholder=\"Addess...\" \n");
      out.write("                                                      class=\"form-about-yourself form-control\" id=\"form-about-yourself\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Province</label>\n");
      out.write("                                            <select name=\"province\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                                <option value=\"\">Select Province ...</option>\n");
      out.write("                                                <option value=\"Bangkok\">Bangkok</option>\n");
      out.write("                                                <option value=\"Chanthaburi\">Chanthaburi</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Zipcode</label>\n");
      out.write("                                            <input type=\"text\" name=\"zipcode\" placeholder=\"Zipcode...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Tel</label>\n");
      out.write("                                            <input type=\"text\" name=\"tel\" placeholder=\"Tel...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Dob</label>\n");
      out.write("                                            <input type=\"date\" name=\"dob\" placeholder=\"Birth day...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-email\">Email</label>\n");
      out.write("                                            <input type=\"text\" name=\"email\" placeholder=\"Email...\" class=\"form-email form-control\" id=\"form-email\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"password\" placeholder=\"Password...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"re-Password\" placeholder=\"Confirm Password...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                            <p>Hello</p>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Question</label>\n");
      out.write("                                            <input type=\"text\" name=\"question\" placeholder=\"Question...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"sr-only\" for=\"form-last-name\">Answer</label>\n");
      out.write("                                            <input type=\"text\" name=\"answer\" placeholder=\"Answer...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <button type=\"submit\" class=\"btn\">Sign me up!</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("                        <div class=\"footer-border\"></div>\n");
      out.write("                        <p>Made by Anli Zaimi at <a href=\"http://azmind.com\" target=\"_blank\"><strong>AZMIND</strong></a> \n");
      out.write("                            having a lot of fun. <i class=\"fa fa-smile-o\"></i></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Javascript -->\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 10]>\n");
      out.write("            <script src=\"assets/js/placeholder.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
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
