/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2019-09-29 17:19:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class a_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Login Application</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".topnav a{\r\n");
      out.write("float:left;\r\n");
      out.write("color:#f2f2f2;\r\n");
      out.write("text-align:center;\r\n");
      out.write("padding:14px 16px;\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("font-size:17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a:hover{\r\n");
      out.write("background-color:#ddd;\r\n");
      out.write("color:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a.active{\r\n");
      out.write("background-color:#4CAF50;\r\n");
      out.write("color:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("   position:fixed;\r\n");
      out.write("   left:0px;\r\n");
      out.write("   bottom:0px;\r\n");
      out.write("   height:30px;\r\n");
      out.write("   width:100%;\r\n");
      out.write("   background:#999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("\t\r\n");
      out.write("\tbackground:url('bg1.jpg'); \r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Property Management System/WebContent/js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class = \"topnav\">\r\n");
      out.write("<a class = \"active\"  href=\"HomePage.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a href=\"AboutUs.jsp\">About Us</a>\r\n");
      out.write("\t\t\t<a href=\"Search.jsp\">Search</a>\r\n");
      out.write("\t\t\t<a href=\"Login.jsp\">Book Now!!!</a>\r\n");
      out.write("\t\t\t<a href=\"AdminLogin.jsp\">Inventory Control</a>\r\n");
      out.write("\t\t\t<a href=\"ContactUs.jsp\">Contact Us</a>\r\n");
      out.write("\t\t\t<font align:right>\r\n");
      out.write("\t\t\t<a href=\"AdminLogin.jsp\">Admin Login</a>\r\n");
      out.write("\t\t\t<a href=\"Login.jsp\">Guest Login</a>\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("</div>\r\n");
      out.write("\t<form name=\"form\" action=\"LoginServlet\" method=\"post\"\r\n");
      out.write("\t\tonSubmit=\"return formValidate();\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<fieldset style=\"width: 500px\">\r\n");
      out.write("\t\t\t\t<legend> Login to Guest</legend>\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"50%\" cellpadding=\"5\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"2\">Login Here</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Username</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"username\" value=\"\" autofocus\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Username\" autocomplete=\"off\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Password</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Password\" autocomplete=\"off\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><span style=\"color: red\">");
      out.print((request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage"));
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" value=\"Login\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"reset\" value=\"Reset\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">Not Yet Registered !!! <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"Register.jsp\">Register Here</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</fieldset>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br><br><br>\r\n");
      out.write("<footer><div align=\"center\" style =\"background-color:#808080\">All Rights Reserved@Hotel RoomPalace Pvt Ltd year 2018</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}