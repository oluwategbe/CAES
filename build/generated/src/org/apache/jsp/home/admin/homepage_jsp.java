package org.apache.jsp.home.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"d-flex justify-content-center align-items-center bg-image dashboard\">\n");
      out.write("            <div class=\"mask\" style=\"background-color: rgba(0, 0, 0, 0.6)\">\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light p-2\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><div class=\"text2 text-white\">Career Path Advisory System</b></div></a>\n");
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
      out.write("                          <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("                          <a class=\"dropdown-item\" href=\"#\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                      </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </nav>\n");
      out.write("              <div class=\"p-5 text-center bg-light\">\n");
      out.write("                <h1 class=\"mb-3 h1 text-dark\">Hey ");
      out.print( request.getSession().getAttribute("username"));
      out.write("!</h1>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"container pt-3 mt-5\" style=\"height: 40%; width: 30%; border: 3px solid blue; box-shadow: 0px 0px 10px 0px #04414d; background-color: buttonface; border-radius: 20px;\">\n");
      out.write("                  <form class=\"pt-1\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/saveCareer\" method=\"post\">\n");
      out.write("                      ");
 if(request.getAttribute("NOTIFICATION") != null){
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger alert-dismissible\" role=\"alert\">\n");
      out.write("                          <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                          ");
      out.print(request.getAttribute("NOTIFICATION"));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                      <h4 class=\"h4 text-center\">Enter the careers, personalities, minimum scores and fields</h4> \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                      <label for=\"Personality\">Personality</label>\n");
      out.write("                                      <input type=\"text\" class=\"form-control\" id=\"personality\" name=\"personality\" placeholder=\"Personality\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"Field\">Field</label>\n");
      out.write("                                    <select class=\"form-control\" id=\"field\" name=\"field\">\n");
      out.write("                                        <option>art</option>                                        \n");
      out.write("                                        <option>science</option>\n");
      out.write("                                        <option>commercial</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                      <label for=\"Careers\">Careers</label>\n");
      out.write("                                      <input type=\"text\" class=\"form-control\" id=\"careers\" name=\"careers\" placeholder=\"Careers\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                      <label for=\"Type\">Type</label>\n");
      out.write("                                      <input type=\"text\" class=\"form-control\" id=\"type\" name=\"type\" placeholder=\"Type\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                      <label for=\"Description\">Description</label>\n");
      out.write("                                      <input type=\"text\" class=\"form-control\" id=\"description\" name=\"description\" placeholder=\"Description\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary w-100 pb-1\">Submit</button>\n");
      out.write("                  </form>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("          </div>\n");
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
