/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-22 10:57:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class membership_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>semi</title>\r\n");
      out.write("<script type=\"text/javascript\" src = \"/semi/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function (){\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#all\").on(\"change\", function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(this.checked == true){\r\n");
      out.write("\t\t\t$(\"#select td input[type = checkbox]\").attr(\"checked\", true);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#select td input[type = checkbox]\").attr(\"checked\",false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("function checkId(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"/semi/checkid\",\r\n");
      out.write("\t\ttype: \"post\",\r\n");
      out.write("\t\tdata:{userid: $(\"#userid\").val() },\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\tconsole.log(\"success : \" + data);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(data == \"ok\"){\r\n");
      out.write("\t\t\t\talert(\"사용 가능한 아이디입니다.\");\r\n");
      out.write("\t\t\t\t$(\"#username\").focus();\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"이미 사용중인 아이디입니다. \\n다시 입력하십시오.\");\r\n");
      out.write("\t\t\t\t$(\"#userid\").select();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(jqXHR, textStatus, errorThrown){\r\n");
      out.write("\t\t\t\tconsole.log(\"error : \" + jqXHR + \",\" + textStatus + \", \" + errorThrown);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#userpwd2\").blur(function(){\r\n");
      out.write("\t\tconsole.log(\"포커스 사라짐.\");\r\n");
      out.write("\t\tvar pwd1 = $(\"#userpwd\").val();\r\n");
      out.write("\t\tvar pwd2 = $(\"#userpwd2\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(pwd1 != pwd2){\r\n");
      out.write("\t\t\talert(\"암호와 암호확인이 일치하지 않습니다. \\n다시 입력하십시오\");\r\n");
      out.write("\t\t\t$(\"#userpwd1\").select();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<section>\r\n");
      out.write("\t<h2 align = \"center\">회원가입</h2><br>\r\n");
      out.write("\t<form action = \"/semi/insert\" method = \"get\">\r\n");
      out.write("\r\n");
      out.write("\t<table width = \"650\" align = \"center\">\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th align = \"left\">*아이디</th>\r\n");
      out.write("\t\t<td><input type = \"text\" name = \"userid\" id = \"userid\" placeholder = \"내용을 입력하세요\" border-color = \"gray\" required>\r\n");
      out.write("\t\t&nbsp; <button onclick = \"return checkId();\">중복 확인</button></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th colspan = \"2\">*영문자 및 숫자만 기입</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<th align = \"left\">*비밀번호</th>\r\n");
      out.write("\t\t<td><input type = \"password\" name = \"userpwd\" id = \"userpwd\" placeholder = \"내용을 입력하세요\" border-color = \"gray\" required></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th align = \"left\">*비밀번호 확인</th>\r\n");
      out.write("\t\t<td><input type = \"password\" id = \"userpwd2\" placeholder = \"내용을 입력하세요\" border-color = \"gray\" required>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th align = \"left\">*생년월일</th>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type = \"date\" name = \"birth\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th align = \"left\">*이메일</th>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type = \"text\" name = \"email\" id = \"email\" placeholder = \"아이디\">@\r\n");
      out.write("\t\t<select name = \"emailback\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<option value = \"naver.com\">naver.com</option>\r\n");
      out.write("\t\t\t<option value = \"daum.com\">daum.com</option>\r\n");
      out.write("\t\t\t<option value = \"gmail.com\">gmail.com</option>\r\n");
      out.write("\t\t\t<option value = \"anyone\" selected>기타</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th align = \"left\">*이름</th>\r\n");
      out.write("\t\t<td><input type = \"text\" id = \"username\" name = \"username\" placeholder = \"내용을 입력하세요\" border-color = \"gray\" required></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th align = \"left\">*전화번호(-제외)</th>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<select name = \"frontphone\">\r\n");
      out.write("\t\t\t\t<option value = \"010\" selected>010</option>\r\n");
      out.write("\t\t\t\t<option value = \"017\">017</option>\r\n");
      out.write("\t\t\t\t<option value = \"011\">011</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<input type = \"text\" name = \"phone\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr height = \"40\">\r\n");
      out.write("\t\t<th align = \"left\">*성별</th>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<input type = \"radio\" name = \"gender\" value = \"M\">남자 &nbsp;\r\n");
      out.write("\t\t\t<input type = \"radio\" name = \"gender\" value = \"F\">여자\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("  \t\t<tr height = \"40\">\r\n");
      out.write("  \t\t\t<th align = \"left\">*주소</th>\r\n");
      out.write("  \t\t\t<td>\r\n");
      out.write("  \t\t\t<table>\r\n");
      out.write("  \t\t\t<tr>\r\n");
      out.write("  \t\t\t\t<td width = \"150\"><input type = \"text\" name = \"codepostal\" required></td>\r\n");
      out.write("  \t\t\t\t<td width = \"150\"><input type = \"button\" name = \"findaddress\" value = \"주소찾기\"></td>\r\n");
      out.write("  \t\t\t</tr>\r\n");
      out.write("  \t\t\t<tr>\r\n");
      out.write("  \t\t\t\t<td><input type = \"text\" name = \"address1\" required></td>\r\n");
      out.write("  \t\t\t</tr>\r\n");
      out.write("  \t\t\t<tr>\r\n");
      out.write("  \t\t\t\t<td><input type = \"text\" name = \"address2\" required></td>\r\n");
      out.write("  \t\t\t</tr>\r\n");
      out.write("  \t\t\t</table>\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\t</td>\r\n");
      out.write("  \t\r\n");
      out.write("\t\t<table align = \"center\" id = \"select\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td width = \"250\"><input type = \"checkbox\" required>이용약관(필수)</td> \r\n");
      out.write("\t\t\t\t<td width = \"250\"><input type = \"checkbox\" required>개인정보 수집 및 이용(필수)</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width = \"250\"><input type = \"checkbox\" name = \"check1\" value = \"Y\" >이메일 수신 동의</td>\r\n");
      out.write("\t\t\t\t<td width = \"250\"><input type = \"checkbox\" name = \"check2\" value = \"Y\" >SMS 수신동의</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align = \"right\">\r\n");
      out.write("\t\t\t\t<td width = \"250\"><input type = \"checkbox\" id = \"all\" value = \"checkall\">전체동의</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div align = \"center\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\t<input type = \"submit\" value = \"가입하기\" style = \"width : 300px; height : 60px; color : white; border : 0;background-color : black\">&nbsp;\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
