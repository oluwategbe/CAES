package org.apache.jsp.home.art;

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
      out.write("        <title>Homepage</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand navbar-dark fixed-top p-2 bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"home/dashboard.jsp\"><div class=\"text2 text-white\">Career Path Advisory System</b></div></a>\n");
      out.write("            <a class=\"nav-link\" href=\"home/about.jsp\"><div class=\"h4 mb-0 text-white\">About</b></div></a>\n");
      out.write("                    <a class=\"nav-link\" href=\"home/contact.jsp\"><div class=\"h4 mb-0 text-white\">Contact</b></div></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fas fa-user fa-2x\"></i> ");
      out.print( request.getSession().getAttribute("username"));
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"home/login.jsp\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"align-items-center bg-image\" style=\"background-image: url('../images/dashboardbackground.jpg'); height: 100vh; margin-top: 0px;\">\n");
      out.write("            <div class=\"mask\" style=\"background-color: rgba(0, 0, 0, 0.8)\">\n");
      out.write("                <div class=\"card-deck p-4 w-50 mx-auto\" style='margin-top: 100px;'>\n");
      out.write("                    <div class=\"card bg-success\">\n");
      out.write("                        <div class=\"card-body text-center text-white\">\n");
      out.write("                           <p class=\"card-text h6\">Input Exam scores</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card bg-primary\">\n");
      out.write("                        <div class=\"card-body text-center text-white\">\n");
      out.write("                            <p class=\"card-text h6\">Take the personality test</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card bg-danger\">\n");
      out.write("                        <div class=\"card-body text-center text-white\">\n");
      out.write("                            <p class=\"card-text h6\">View career suggestions</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <section class=\"container-fluid\">\n");
      out.write("                    <section class=\"row justify-content-center\">\n");
      out.write("                        <section class=\"col-12 col-sm-6 col-md-3\">\n");
      out.write("                            <form class=\"pt-1 bg-dark\" style=\"width: 100%;position: absolute;top: 3vh;padding: 20px;border-radius: 10px;\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/art\" method=\"post\">\n");
      out.write("                                <h5 class=\"h5 text-center text-white bg-danger\">Rate your proficiency in these subjects:</h5> \n");
      out.write("                                <div class=\"row text-center w-100 mx-auto text-white\">\n");
      out.write("                                    <div class=\"col-4 text-center p-0\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3 p-0\">\n");
      out.write("                                        <h6 class=\"h6\">Above Average</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2 p-0 mt-2\">\n");
      out.write("                                        <h6 class=\"h6\">Average</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3 p-0\">\n");
      out.write("                                        <h6 class=\"h6\">Below Average</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mx-auto w-100 text-center text-white\">\n");
      out.write("                                    <div class=\"col-4 text-center\">\n");
      out.write("                                        <h5 class='h5'>Maths</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"maths\" value=\"75\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <input type=\"radio\" name=\"maths\" value=\"50\" checked>\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"maths\" value=\"25\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mx-auto w-100 text-center text-white\">\n");
      out.write("                                    <div class=\"col-4 text-center\">\n");
      out.write("                                        <h5 class='h5'>English</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"english\" value=\"75\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <input type=\"radio\" name=\"english\" value=\"50\" checked>\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"english\" value=\"25\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mx-auto w-100 text-center text-white\">\n");
      out.write("                                    <div class=\"col-4 text-center\">\n");
      out.write("                                        <h5 class='h5'>Literature-in-English</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"literature\" value=\"75\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <input type=\"radio\" name=\"literature\" value=\"50\" checked>\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"literature\" value=\"25\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mx-auto w-100 text-center text-white\">\n");
      out.write("                                    <div class=\"col-4 text-center\">\n");
      out.write("                                        <h5 class='h5'>History</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"history\" value=\"75\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <input type=\"radio\" name=\"history\" value=\"50\" checked>\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"history\" value=\"25\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mx-auto w-100 text-center text-white\">\n");
      out.write("                                    <div class=\"col-4 text-center\">\n");
      out.write("                                        <h5 class='h5'>Government</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"government\" value=\"75\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <input type=\"radio\" name=\"government\" value=\"50\" checked>\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <input type=\"radio\" name=\"government\" value=\"25\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mb-0\">\n");
      out.write("                                    <div class='col-6'>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <a href=\"home/index.jsp\" class=\"btn btn-primary w-100\">Back</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class='col-6'>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-primary w-100\">Next</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </section>\n");
      out.write("                    </section>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
