<%--
  Created by IntelliJ IDEA.
  User: Randstad
  Date: 3/19/2019
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Servlet Test</title>
  </head>
  <body>

  <form action="Servlet_junk" method="post">
    <p>
      First Name:<input name="firstName" type="text"/> Last Name:<input name="lastName" type="text"/></br>
      Address Line 1:<input name="add1" type="text"/></br>
      Address Line 2:<input name="add2" type="text"/></br>
      City:<input name="city" type="text"/>, State:<input name="state" type="text"/> Zip:<input name="zip" type="text" maxlength="5"/></br>
      Telephone:<input name="tele" type="text" maxlength="15"/></br>
    </p>
    <p><input type="submit" value="Submit"/></p>
  </form>

  </body>
</html>
