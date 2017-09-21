package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("layui/css/layui.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("css/admin.css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("js/admin.js\" ></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\t\t\t<header class=\"layui-header header\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-main\">\r\n");
      out.write("\t\t\t\t    <a class=\"logo\" href=\"/\">\r\n");
      out.write("\t\t\t\t      <img src=\"");
      out.print(basePath );
      out.write("images/logo1.png\" alt=\"present\">\r\n");
      out.write("\t\t\t\t      <span>系统</span>\r\n");
      out.write("\t\t\t\t    </a>\r\n");
      out.write("\t\t\t\t    <!--<div class=\"user\">\r\n");
      out.write("\t\t\t\t    \t<span>毛娟</span>\r\n");
      out.write("\t\t\t\t    \t<button class=\"layui-btn layui-btn-small\">修改密码</button>\r\n");
      out.write("\t\t\t\t    \t<button class=\"layui-btn layui-btn-small\">退出</button>\r\n");
      out.write("\t\t\t\t    </div>-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<fieldset class=\"layui-elem-field loginMain\">\r\n");
      out.write("\t\t\t\t\t<legend>登陆</legend>\r\n");
      out.write("\t\t\t  \t<div class=\"layui-field-box\">\r\n");
      out.write("\t\t\t\t\t<form class=\"layui-form\" id=\"login-form\" action=\"");
      out.print(basePath );
      out.write("loginIt.do?login\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t   \t<input name=\"username\" lay-verify=\"\" autocomplete=\"off\" placeholder=\"账号\" class=\"layui-input\" type=\"text\" onChange=\"initLoginWay();\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t    <input name=\"password\" lay-verify=\"pass\" placeholder=\"密码\" autocomplete=\"off\" class=\"layui-input\" type=\"password\" onChange=\"initLoginWay();\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t    <button class=\"layui-btn\"  onClick=\"checkCodePaper();\" >登陆</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"checkbox\" name=\"remember\" value=\"1\" id=\"remember\"/>\r\n");
      out.write("\t                        <input type=\"hidden\" id=\"setCookie\" value=\"0\" name=\"setCookie\"/>\r\n");
      out.write("\t                        <input type=\"hidden\" id=\"cookieLogin\" value=\"0\" name=\"cookieLogin\"/>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</fieldset>\r\n");
      out.write("\t\t<script src=\"");
      out.print(basePath );
      out.write("js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--\t\t<script src=\"");
      out.print(basePath );
      out.write("layui/layui.js\" charset=\"utf-8\"></script>-->\r\n");
      out.write("\t\t\t\t<!-- 自定义 js 存放点 -->\r\n");
      out.write("\t\t<script src=\"");
      out.print(basePath );
      out.write("js/cookieHandel.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.print(basePath );
      out.write("js/sys/login.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\tvar basePath = '");
      out.print(basePath );
      out.write("';\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
