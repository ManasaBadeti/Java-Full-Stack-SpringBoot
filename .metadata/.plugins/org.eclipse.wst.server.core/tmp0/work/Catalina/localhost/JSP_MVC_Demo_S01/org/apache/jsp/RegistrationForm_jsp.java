/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2021-09-15 10:09:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrationForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>JFSD SKILL-4</title>\r\n");
      out.write("\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet' type='text/css'>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("\t-webkit-transition-property: all;\r\n");
      out.write("\t-webkit-transition-duration: .2s;\r\n");
      out.write("  -moz-transition-timing-function: cubic-bezier(100,50,21,6);\r\n");
      out.write("\t-moz-transition-property: all;\r\n");
      out.write("  -moz-transition-timing-function: cubic-bezier(100,50,21,6);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("  background:#3e3e59;\r\n");
      out.write("  padding:75px;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("  font-family: 'Oswald', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("  color:#c0c0c0;\r\n");
      out.write("  font-weight:100;\r\n");
      out.write("  margin-top:-70px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn{\r\n");
      out.write("  color:#999;\r\n");
      out.write("  background:rgba(0, 0, 0, 0.5);\r\n");
      out.write("  padding:25px 35px;\r\n");
      out.write("  font-size:12px;\r\n");
      out.write("  text-decoration:none;\r\n");
      out.write("  letter-spacing:2px;\r\n");
      out.write("  text-transform:uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover{\r\n");
      out.write("  border:none;\r\n");
      out.write("  background:rgba(0, 0, 0, 0.4);\r\n");
      out.write("  background:#fff;\r\n");
      out.write("  padding:40px 50px; #000;\r\n");
      out.write("  color:#1b1b1b;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@import url('https://fonts.googleapis.com/css?family=Abel|Abril+Fatface|Alegreya|Arima+Madurai|Dancing+Script|Dosis|Merriweather|Oleo+Script|Overlock|PT+Serif|Pacifico|Playball|Playfair+Display|Share|Unica+One|Vibur');\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("    width: 450px;\r\n");
      out.write("    min-height: 350px;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    margin: 2% auto;\r\n");
      out.write("    box-shadow: 0 7px 30px hsla(20, 67%, 55%, 0.31);\r\n");
      out.write("    padding: 2%;\r\n");
      out.write("    background-image: linear-gradient(-225deg, #E3FDF5 50%, #FFE6FA 50%);\r\n");
      out.write("}\r\n");
      out.write("/* form Container */\r\n");
      out.write("form .con {\r\n");
      out.write("    display: -webkit-flex;\r\n");
      out.write("    display: flex;\r\n");
      out.write("  \r\n");
      out.write("    -webkit-justify-content: space-around;\r\n");
      out.write("    justify-content: space-around;\r\n");
      out.write("  \r\n");
      out.write("    -webkit-flex-wrap: wrap;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("  \r\n");
      out.write("      margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* the header form form */\r\n");
      out.write("header {\r\n");
      out.write("    margin: 2% auto 10% auto;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("/* Login title form form */\r\n");
      out.write("header h2 {\r\n");
      out.write("    font-size: 250%;\r\n");
      out.write("    font-family: 'Playfair Display', serif;\r\n");
      out.write("    color: #3e403f;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header p {letter-spacing: 0.05em;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".input-item {\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    padding: 13px 0px 13px 7px;\r\n");
      out.write("    border-radius: 4px 0px 0px 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Show/hide password Font Icon */\r\n");
      out.write("#eye {\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    color: #333;\r\n");
      out.write("  \r\n");
      out.write("    margin: 5.9px 0 0 0;\r\n");
      out.write("    margin-left: -20px;\r\n");
      out.write("    padding: 12px 9px 13px 0px;\r\n");
      out.write("    border-radius: 0px 5px 5px 0px;\r\n");
      out.write("  \r\n");
      out.write("    float: right;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    right: 1%;\r\n");
      out.write("    top: -.2%;\r\n");
      out.write("    z-index: 5;\r\n");
      out.write("    \r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("/* inputs form  */\r\n");
      out.write("input[class=\"form-input\"]{\r\n");
      out.write("    width: 240px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("  \r\n");
      out.write("    margin-top: 2%;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    \r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-family: 'Abel', sans-serif;\r\n");
      out.write("    color: #5E6472;\r\n");
      out.write("  \r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: none;\r\n");
      out.write("  \r\n");
      out.write("    border-radius: 0px 5px 5px 0px;\r\n");
      out.write("    transition: 0.2s linear;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("input[id=\"txt-input\"] {width: 250px;}\r\n");
      out.write("/* focus  */\r\n");
      out.write("input:focus {\r\n");
      out.write("    transform: translateX(-2px);\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* input[type=\"text\"] {min-width: 250px;} */\r\n");
      out.write("/* buttons  */\r\n");
      out.write("button {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    color: #252537;\r\n");
      out.write("  \r\n");
      out.write("    width: 280px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("  \r\n");
      out.write("    padding: 0 20px;\r\n");
      out.write("   background: #B8F2E6;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    \r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: none;\r\n");
      out.write("  \r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    transition: all 0.2s linear;\r\n");
      out.write("    \r\n");
      out.write("    margin: 7% auto;\r\n");
      out.write("    letter-spacing: 0.05em;\r\n");
      out.write("}\r\n");
      out.write("/* Submits */\r\n");
      out.write(".submits {\r\n");
      out.write("    width: 48%;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    float: left;\r\n");
      out.write("    margin-left: 2%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* buttons hover */\r\n");
      out.write("button:hover {\r\n");
      out.write("    transform: translatey(3px);\r\n");
      out.write("    box-shadow: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* buttons hover Animation */\r\n");
      out.write("button:hover {\r\n");
      out.write("    animation: ani9 0.4s ease-in-out infinite alternate;\r\n");
      out.write("}\r\n");
      out.write("@keyframes ani9 {\r\n");
      out.write("    0% {\r\n");
      out.write("        transform: translateY(3px);\r\n");
      out.write("    }\r\n");
      out.write("    100% {\r\n");
      out.write("        transform: translateY(5px);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<<h1 align=center style=\"font-weight:bold;font-size:50px\">JSP MVC DEMO 2 ...!!!</h1><hr color=\"white\"><br><br>\r\n");
      out.write("<h><h><br>\r\n");
      out.write("<a href=\"RegistrationForm.jsp\" class=\"btn\" style=\"font-weight:bold;font-size:15px\">Registration</a>\r\n");
      out.write("    <a href=\"LoginForm\" class=\"btn\" style=\"font-weight:bold;font-size:15px\">Login</a>\r\n");
      out.write("    \r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"overlay\">\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"register\">\r\n");
      out.write("   <div class=\"con\">\r\n");
      out.write("   <header class=\"head-form\">\r\n");
      out.write("      <h2>Employee Registration</h2>\r\n");
      out.write("   </header>\r\n");
      out.write("  \r\n");
      out.write("   <div class=\"field-set\">\r\n");
      out.write("         <span class=\"input-item\">\r\n");
      out.write("           <i class=\"fa fa-user-circle\"></i>\r\n");
      out.write("         </span>\r\n");
      out.write("         <input class=\"form-input\" id=\"txt-input\" type=\"text\" placeholder=\"Full Name\" name=\"name\" required>\r\n");
      out.write("      <br>  \r\n");
      out.write("      \r\n");
      out.write("      <span class=\"radio-inline\">\r\n");
      out.write("           <i class=\"radio-inline\"></i>\r\n");
      out.write("         </span>\r\n");
      out.write("         <input class=\"radio-inline\" value=\"male\" type=\"radio\" name=\"gender\" required>Male\r\n");
      out.write("         &nbsp;  &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("          <input class=\"radio-inline\" value=\"female\" type=\"radio\" name=\"gender\" required>Female\r\n");
      out.write("        \r\n");
      out.write("      <br>  \r\n");
      out.write("      <span class=\"input-item\">\r\n");
      out.write("           <i class=\"fa fa-user-circle\"></i>\r\n");
      out.write("         </span>\r\n");
      out.write("         <input class=\"form-input\" id=\"txt-input\" type=\"text\" placeholder=\"UserName\" name=\"username\" required>\r\n");
      out.write("      <br>  \r\n");
      out.write("      <span class=\"input-item\">\r\n");
      out.write("           <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("         </span>\r\n");
      out.write("         <input class=\"form-input\" id=\"txt-input\" type=\"text\" placeholder=\"Email\" name=\"email\" required>\r\n");
      out.write("      <br> \r\n");
      out.write("      <span class=\"input-item\">\r\n");
      out.write("        <i class=\"fa fa-key\"></i>\r\n");
      out.write("       </span>\r\n");
      out.write("      <input class=\"form-input\" type=\"password\" placeholder=\"Password\" id=\"pwd\"  name=\"password\" required>\r\n");
      out.write("     <span>\r\n");
      out.write("        <i class=\"fa fa-eye\" aria-hidden=\"true\"  type=\"button\" id=\"eye\"></i>\r\n");
      out.write("     </span>\r\n");
      out.write("      <br>\r\n");
      out.write("       \r\n");
      out.write("      <span class=\"input-item\">\r\n");
      out.write("           <i class=\"fa fa-map-marker\"></i>\r\n");
      out.write("         </span>\r\n");
      out.write("         <input class=\"form-input\" id=\"txt-input\" type=\"text\" placeholder=\"location\" name=\"location\" required>\r\n");
      out.write("      <br>  \r\n");
      out.write("      <button class=\"log-in\"> Register </button>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>// Show/hide password onClick of button using Javascript only\r\n");
      out.write("\r\n");
      out.write("// https://stackoverflow.com/questions/31224651/show-hide-password-onclick-of-button-using-javascript-only\r\n");
      out.write("\r\n");
      out.write("function show() {\r\n");
      out.write("    var p = document.getElementById('pwd');\r\n");
      out.write("    p.setAttribute('type', 'text');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function hide() {\r\n");
      out.write("    var p = document.getElementById('pwd');\r\n");
      out.write("    p.setAttribute('type', 'password');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var pwShown = 0;\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"eye\").addEventListener(\"click\", function () {\r\n");
      out.write("    if (pwShown == 0) {\r\n");
      out.write("        pwShown = 1;\r\n");
      out.write("        show();\r\n");
      out.write("    } else {\r\n");
      out.write("        pwShown = 0;\r\n");
      out.write("        hide();\r\n");
      out.write("    }\r\n");
      out.write("}, false);\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
