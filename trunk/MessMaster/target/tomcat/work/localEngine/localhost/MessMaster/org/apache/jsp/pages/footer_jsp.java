package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"container-fluid foot\">\r\n");
      out.write("        <section class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12 copyrt\"><p>Copyright &copy; mrptech 2015 Manasweb-v1.0</p></div>\r\n");
      out.write("        <div  >\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<h4>Contact Address</h4>\r\n");
      out.write("\t\t\t\t<address>\r\n");
      out.write("\t\t\t\t\t#17/A ,Udaya nagar,\r\n");
      out.write("\t\t\t\t\tBangalore-16\r\n");
      out.write("\t\t\t\t</address>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<ul class=\"footer-nav\">\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">About</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">Link</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        </section>\r\n");
      out.write("        </div>\r\n");
      out.write("<!-- Start of the footer-->\r\n");
      out.write("<!-- <footer class=\"site-footer\">\r\n");
      out.write("\t<div class=\"container-fluid foot\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<h4>Contact Address</h4>\r\n");
      out.write("\t\t\t\t<address>\r\n");
      out.write("\t\t\t\t\t#17/A ,Udaya nagar,\r\n");
      out.write("\t\t\t\t\tBangalore-16\r\n");
      out.write("\t\t\t\t</address>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bottom-footer\" >\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">@copyright ManasWeb 2015.</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<ul class=\"footer-nav\">\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">About</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">Link</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer> -->\r\n");
      out.write("<!-- End of the footer-->");
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
