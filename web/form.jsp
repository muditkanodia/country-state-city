<%-- 
    Document   : form
    Created on : Jul 19, 2017, 9:16:30 PM
    Author     : nishu
--%>
<%@include file="dbConn.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function count(x)
            {
                var a;

                if (window.XMLHttpRequest)
                {
                    a = new XMLHttpRequest();
                }
                else
                {
                    a = new ActiveXobject("Microsoft.XMLHTTP");


                }

                a.onreadystatechange = function()
                {
                    if (a.readyState == 4 && a.status == 200)
                    {
                        document.getElementById("mydiv").innerHTML = a.responseText;
                    }
                }
                a.open("post", "uidstate_ajax.jsp?cid=" + x, true);
                a.send();
            }

            function stat(y)
            {
                var a;

                if (window.XMLHttpRequest)
                {
                    a = new XMLHttpRequest();
                }
                else
                {
                    a = new ActiveXobject("Microsoft.XMLHTTP");


                }

                a.onreadystatechange = function()
                {
                    if (a.readyState == 4 && a.status == 200)
                    {
                        document.getElementById("mydiv1").innerHTML = a.responseText;
                    }
                }
                a.open("post", "uidcity_ajax.jsp?sid=" + y, true);
                a.send();
            }
        </script>    
    </head>
    <body>
        <form>
            <table>
                <tr>
                    <td colspan="3"><center><b>Country</b></center></td> 
                <td><label>

                        <select name="country" onchange="count(this.value)">

                            <option>--Select--</option>
                            <%
                                try {
//                                    Class.forName("com.mysql.jdbc.Driver");
//                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "");
                                    PreparedStatement ps = con.prepareStatement("select * from countryid");
                                    ResultSet rs = ps.executeQuery();
                                    while (rs.next()) {
                            %>
                            <option value="<%=rs.getString(2)%>"><%=rs.getString(2)%></option> 
                            <%
                                    }
                                } catch (Exception e) {
                                    out.println(e);
                                }
                            %>                
                        </select>
                    </label></td>
                </tr>
                <tr>
                    <td colspan="3"><center><b>State</b><cener></td>
                        <td id="mydiv"><label>
                                <select>
                                    <option>--Select--</option>
                                </select>
                        </td>
                        </tr>
                        <tr>
                            <td colspan="3"><center><b>City</b></center></td>
                        <td id="mydiv1"><label>
                                <select>

                                    <option>--Select--</option>

                                </select>
                        </td>
                        </tr>
                        </table>
                        </form>
                        </body>
                        </html>
