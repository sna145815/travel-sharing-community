/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-11-07 01:23:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/layout/header.jsp", Long.valueOf(1667630134051L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>TravelPlan</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"/main\">TravelPlan</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"/join\">회원가입</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"/login\">로그인</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"/board\">게시판</a>\r\n");
      out.write("      </li>    \r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>  \r\n");
      out.write("</nav>\r\n");
      out.write("<br>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"kr\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("    <meta name=\"generator\" content=\"Hugo 0.104.2\">\r\n");
      out.write("    <title>Album example · Bootstrap v5.2</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.2/examples/album/\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicons -->\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"/docs/5.2/assets/img/favicons/apple-touch-icon.png\" sizes=\"180x180\">\r\n");
      out.write("<link rel=\"icon\" href=\"/docs/5.2/assets/img/favicons/favicon-32x32.png\" sizes=\"32x32\" type=\"image/png\">\r\n");
      out.write("<link rel=\"icon\" href=\"/docs/5.2/assets/img/favicons/favicon-16x16.png\" sizes=\"16x16\" type=\"image/png\">\r\n");
      out.write("<link rel=\"manifest\" href=\"/docs/5.2/assets/img/favicons/manifest.json\">\r\n");
      out.write("<link rel=\"mask-icon\" href=\"/docs/5.2/assets/img/favicons/safari-pinned-tab.svg\" color=\"#712cf9\">\r\n");
      out.write("<link rel=\"icon\" href=\"/docs/5.2/assets/img/favicons/favicon.ico\">\r\n");
      out.write("<meta name=\"theme-color\" content=\"#712cf9\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-divider {\r\n");
      out.write("        height: 3rem;\r\n");
      out.write("        background-color: rgba(0, 0, 0, .1);\r\n");
      out.write("        border: solid rgba(0, 0, 0, .15);\r\n");
      out.write("        border-width: 1px 0;\r\n");
      out.write("        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-vr {\r\n");
      out.write("        flex-shrink: 0;\r\n");
      out.write("        width: 1.5rem;\r\n");
      out.write("        height: 100vh;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .bi {\r\n");
      out.write("        vertical-align: -.125em;\r\n");
      out.write("        fill: currentColor;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        z-index: 2;\r\n");
      out.write("        height: 2.75rem;\r\n");
      out.write("        overflow-y: hidden;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller .nav {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-wrap: nowrap;\r\n");
      out.write("        padding-bottom: 1rem;\r\n");
      out.write("        margin-top: -1px;\r\n");
      out.write("        overflow-x: auto;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        white-space: nowrap;\r\n");
      out.write("        -webkit-overflow-scrolling: touch;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<main>\r\n");
      out.write("\r\n");
      out.write("  <section class=\"py-5 text-center container\">\r\n");
      out.write("    <div class=\"row py-lg-5\">\r\n");
      out.write("      <div class=\"col-lg-6 col-md-8 mx-auto\">\r\n");
      out.write("        <h1 class=\"fw-light\">대전관광명소</h1>\r\n");
      out.write("        <p class=\"lead text-muted\">대전 여행 </p>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"album py-5 bg-light\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("          <div class=\"card shadow-sm\">\r\n");
      out.write("			<img src=\"/img/sikjang.jpg\" class=\"img-fluid\" alt=\"...\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <p class=\"card-text\">식장산</p>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("               \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("          <div class=\"card shadow-sm\">\r\n");
      out.write("             <img src=\"/img/yurim.jpg\" class=\"img-fluid\" alt=\"...\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <p class=\"card-text\">유림공원</p>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("             \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("          <div class=\"card shadow-sm\">\r\n");
      out.write("            <img src=\"/img/dunsan.jpg\" class=\"img-fluid\" alt=\"...\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <p class=\"card-text\">둔산동</p>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"col\">\r\n");
      out.write("          <div class=\"card shadow-sm\">\r\n");
      out.write("           <img src=\"/img/expo.jpg\" class=\"img-fluid\" alt=\"...\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <p class=\"card-text\">엑스포</p>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("               \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("          <div class=\"card shadow-sm\">\r\n");
      out.write("          <img src=\"/img/dd.jpg\" class=\"img-fluid\" alt=\"...\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <p class=\"card-text\">으능정이</p>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("             \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("          <div class=\"card shadow-sm\">\r\n");
      out.write("            <img src=\"/img/sungsim.jpg\" class=\"img-fluid\" >\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <p class=\"card-text\">성심당</p>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
