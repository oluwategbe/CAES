package org.apache.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home/css/bootstrap.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home/css/mycss.css\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\n");
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
      out.write("        <section class=\"container-fluid bgr\">\n");
      out.write("            <section class=\"row justify-content-center\">\n");
      out.write("                <!--\"justify-content-center\" centers it horizontally-->\n");
      out.write("                ");
 if(request.getAttribute("NOTIFICATION") != null){
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger alert-dismissible\" role=\"alert\">\n");
      out.write("                      <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                      ");
      out.print(request.getAttribute("NOTIFICATION"));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <section class=\"col-12 col-sm-6 col-md-3\">\n");
      out.write("                    <div class=\"text1r font-weight-bold\"><b class=\"text-warning\">C</b>areer <b class=\"text-danger\">P</b>ath <b class=\"text-success\">A</b>dvisory <b class=\"text-info\">S</b>ystem</b></div>\n");
      out.write("                    <form class=\"form-containerr pt-1\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register\" method=\"post\">\n");
      out.write("                        <div class=\"font-weight-bold pb-1 text-center\">Sign Up</div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"FirstName\">First Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"firstname\" id=\"firstname\" placeholder=\"Enter Firstname\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"Lastname\">Last Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"lastname\" id=\"lastname\" placeholder=\"Enter Lastname\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"Username\">Username</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" placeholder=\"Enter Username\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"password\">Password</label>\n");
      out.write("                          <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary w-100 pb-1\">Sign up</button>\n");
      out.write("                            <div class=\"text-center\">Already have an account?<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home/login.jsp\">Sign In</div>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
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
