package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mrptech.mess.constants.Tiles;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <div class=\"header navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("   <div class=\"navbar-inner\">\r\n");
      out.write("\t<div class =\"container-fluid\">\r\n");
      out.write("\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"#\" class=\"navbar-brand\">ManasWeb</a>\r\n");
      out.write("\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li ><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">About</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class =\"dropdown-toggle\" data-toggle=\"dropdown\"> WDM Dropdown <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Link1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Link2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Link3</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Separate link</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">One more Separate link</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t  <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("\t\t\t\t </form>\r\n");
      out.write("\t\t\t\t <li title=\"Logout\"><a href=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(Tiles.RD_URL_PATH_PREFIX);
      out.write("/customer/logout\"><i class=\"fa fa-power-off\"></i></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
