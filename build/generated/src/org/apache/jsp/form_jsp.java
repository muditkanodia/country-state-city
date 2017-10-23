package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/dbConn.jsp");
  }

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

      out.write('\n');
      out.write('\n');

    Connection con = null;
    
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    
    String sURL="jdbc:mysql://localhost:3306/st";
    String sUserName="root";
    String sPwd="";
    
    con = DriverManager.getConnection(sURL,sUserName,sPwd);
    
//    Statement stmt = conn.createStatement();
//    ResultSet rs = stmt.executeQuery("select * from tableName");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Simple JSP Java database connectivity</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

//  if(con!=null)
//    con.close();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function count(x)\n");
      out.write("            {\n");
      out.write("                var a;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest)\n");
      out.write("                {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    a = new ActiveXobject(\"Microsoft.XMLHTTP\");\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a.onreadystatechange = function()\n");
      out.write("                {\n");
      out.write("                    if (a.readyState == 4 && a.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"mydiv\").innerHTML = a.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                a.open(\"post\", \"uidstate_ajax.jsp?cid=\" + x, true);\n");
      out.write("                a.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function stat(y)\n");
      out.write("            {\n");
      out.write("                var a;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest)\n");
      out.write("                {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    a = new ActiveXobject(\"Microsoft.XMLHTTP\");\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a.onreadystatechange = function()\n");
      out.write("                {\n");
      out.write("                    if (a.readyState == 4 && a.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"mydiv1\").innerHTML = a.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                a.open(\"post\", \"uidcity_ajax.jsp?sid=\" + y, true);\n");
      out.write("                a.send();\n");
      out.write("            }\n");
      out.write("        </script>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\"><center><b>Country</b></center></td> \n");
      out.write("                <td><label>\n");
      out.write("\n");
      out.write("                        <select name=\"country\" onchange=\"count(this.value)\">\n");
      out.write("\n");
      out.write("                            <option>--Select--</option>\n");
      out.write("                            ");

                                try {
//                                    Class.forName("com.mysql.jdbc.Driver");
//                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "");
                                    PreparedStatement ps = con.prepareStatement("select * from countryid");
                                    ResultSet rs = ps.executeQuery();
                                    while (rs.next()) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option> \n");
      out.write("                            ");

                                    }
                                } catch (Exception e) {
                                    out.println(e);
                                }
                            
      out.write("                \n");
      out.write("                        </select>\n");
      out.write("                    </label></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\"><center><b>State</b><cener></td>\n");
      out.write("                        <td id=\"mydiv\"><label>\n");
      out.write("                                <select>\n");
      out.write("                                    <option>--Select--</option>\n");
      out.write("                                </select>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"3\"><center><b>City</b></center></td>\n");
      out.write("                        <td id=\"mydiv1\"><label>\n");
      out.write("                                <select>\n");
      out.write("\n");
      out.write("                                    <option>--Select--</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                        </table>\n");
      out.write("                        </form>\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
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
