package org.apache.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class suggestions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home/css/mycss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home/css/all.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        <!-- MDB -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.6.0/mdb.min.css\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Career Suggestions Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"d-flex justify-content-center align-items-center bg-image\" style=\"background-image: url(home/images/suggestions.jpg); background-size: cover; height: 100vh; width: 100%;\">\n");
      out.write("            <div class=\"mask\" style=\"background-color: rgba(0, 0, 0, 0.6)\">\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light p-2\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"home/dashboard.jsp\"><div class=\"text2 text-white\">Career Path Advisory System</b></div></a>\n");
      out.write("                <a class=\"nav-link\" href=\"home/about.jsp\"><div class=\"h4 mb-0 text-white\">About</b></div></a>\n");
      out.write("                    <a class=\"nav-link\" href=\"home/contact.jsp\"><div class=\"h4 mb-0 text-white\">Contact</b></div></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                  <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                      <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                        <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                         <i class=\"fas fa-user fa-2x\"></i> ");
      out.print( request.getSession().getAttribute("username"));
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                          <a class=\"dropdown-item\" href=\"home/login.jsp\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                      </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </nav>\n");
      out.write("              <div class=\"p-5 text-center bg-transparent mb-4\">\n");
      out.write("                  <b><h1 class=\"mb-3 h1 text-white\">Congratulations ");
      out.print( request.getSession().getAttribute("username"));
      out.write("!</h1></b>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"p-4 text-center bg-transparent w-75 m-auto\" style=\"margin-top: 30px; border-left: 20px blue solid;\">\n");
      out.write("                  <h2 class=\"h2 text-white\">The system suggests <b class=\"bg-white\" style=\"color: blue\"> ");
      out.print( request.getAttribute("career"));
      out.write("</b> as potential courses for you to major in</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"m-auto bg-transparent text-white text-center w-75 p-4\">\n");
      out.write("                  <div class=\"text-center\">\n");
      out.write("                      <h1 class=\"h1 bg-primary text-white\">Personality</h1>\n");
      out.write("                  </div>\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                  <div>\n");
      out.write("                      <h2 class=\"mb-2 h2\">");
      out.print( request.getAttribute("personality"));
      out.write(':');
      out.write(' ');
      out.print( request.getAttribute("type"));
      out.write("</h2>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                  <div>\n");
      out.write("                    <h3 class=\"mb-2 h3\">");
      out.print( request.getAttribute("description"));
      out.write("</h3>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <form class=\"pt-1\" style=\"width: 100%;background: white;position: absolute;top: 30vh;padding: 30px;border-radius: 10px;\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\" method=\"post\">\n");
      out.write("                    <div class=\"font-weight-bold pb-1 text-center\">Sign in to take the test</div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"Username\">Username</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" placeholder=\"Enter Username\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"password\">Password</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary w-100 pb-1\">Sign in</button>\n");
      out.write("                    <div class=\"text-center\">Don't have an account?<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home/register.jsp\">Register</div>\n");
      out.write("                </form>    \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
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
