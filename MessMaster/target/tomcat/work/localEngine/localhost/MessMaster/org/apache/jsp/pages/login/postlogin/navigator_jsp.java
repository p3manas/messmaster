package org.apache.jsp.pages.login.postlogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mrptech.mess.constants.Tiles;

public final class navigator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!-- sidebar start -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\r\n");
      out.write("\t$(function() {\t\t\r\n");
      out.write("\t    $(\"a\").click(function() {\t    \t\r\n");
      out.write("\t      $this = $(this);\r\n");
      out.write("\t      localStorage.setItem(\"highlight\", $this.parent().attr('id'));\r\n");
      out.write("\t\t      if($this.parent().parent().parent().hasClass(\"start\")){\t\r\n");
      out.write("\t\t    \t  localStorage.removeItem(\"highlight\");\r\n");
      out.write("\t\t\t\t  localStorage.setItem(\"highlight\", $this.parent().attr('id')+\"|\"+$this.parent().parent().parent().attr('id'));\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t    });\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    setHighlight(localStorage.getItem(\"highlight\"));\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction setHighlight(id){\t\r\n");
      out.write("\t\tconsole.log(id +\" \"+isDashboard)\r\n");
      out.write("\t\tif(id==\"undefined\" || id==\"null\" || id==null){\t\t\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(isDashboard == \"true\"){\r\n");
      out.write("\t\t\tisDashboard = \"false\";\r\n");
      out.write("\t\t\tlocalStorage.setItem(\"highlight\",\"dashbord1\");\r\n");
      out.write("\t    \tsetHighlight(\"dashbord1\");\r\n");
      out.write("\t    \treturn;\r\n");
      out.write("\t    }\r\n");
      out.write("\t\tconsole.log(id+\"--->\")\r\n");
      out.write("\t\t $('li').removeClass('active');\r\n");
      out.write("\t\t var id_ =id.split(\"|\")\r\n");
      out.write("\t\t $(\"#\"+id_[0]).addClass('active');\r\n");
      out.write("\t\t if(id_.length>0){\r\n");
      out.write("\t\t\t $(\"#\"+id_[1]).addClass('active open');\r\n");
      out.write("\t\t\t $(\"#\"+id_[1]+\" span\").addClass('open'); \r\n");
      out.write("\t\t }\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"page-container\">\r\n");
      out.write("\t<div class=\"page-sidebar nav-collapse collapse\">      \r\n");
      out.write("\t\t<ul class=\"page-sidebar-menu\">\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-toggler hidden-phone\">\r\n");
      out.write("               \t\t<span class=\"tog-icon\" id=\"menuOpen\"><i class=\"fa fa-ellipsis-v\"></i>&nbsp;<i class=\"fa fa-arrow-left\"></i></span>\r\n");
      out.write("                 \t<span class=\"tog-icon\" id=\"menuClose\" style=\"display:none;\"><i class=\"fa fa-ellipsis-v\"></i>&nbsp;<i class=\"fa fa-arrow-right\"></i></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"start\" id=\"dashbord1\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(Tiles.RD_URL_PATH_PREFIX);
      out.write("/custdashboard\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-dashboard\"></i> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"title\">");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"selected\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction profile() {\r\n");
      out.write("\t\tvar category = $(\"#userCategory\").val();\r\n");
      out.write("\t\twindow.location.href = '");
      out.print(request.getContextPath());
      out.write('/');
      out.print(Tiles.RD_URL_PATH_PREFIX);
      out.write("/settings/viewprofile?category=' + category;\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t $.slidebars();\r\n");
      out.write("\t\t App.init();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /pages/login/postlogin/navigator.jsp(55,26) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("dashboard.lbl");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/login/postlogin/navigator.jsp(60,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/login/postlogin/navigator.jsp(60,3) '${SideMenu}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${SideMenu}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/login/postlogin/navigator.jsp(60,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t<a class=\"\" href=\"javascript:;\">\r\n");
          out.write("\t\t\t\t\t\t<i class=\"fa fa-retweet\"></i>\r\n");
          out.write("\t\t\t\t\t\t<span class=\"title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t<span class=\"arrow\"></span>\r\n");
          out.write("\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t<ul class=\"sub-menu\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</ul>\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /pages/login/postlogin/navigator.jsp(69,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/pages/login/postlogin/navigator.jsp(69,5) '${entry.value}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${entry.value}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/login/postlogin/navigator.jsp(69,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("double");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t<li id=\"loanreq\"><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${double.password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${double.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
