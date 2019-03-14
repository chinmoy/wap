<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/13/2019
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link href="resources/css/style.css" type="text/css" rel="stylesheet">
  </head>
  <body>
    <div id="contactForm">
      <form action="support" method="post" >
        <p><label>Name: </label><input type="text" name="name"></p>
        <p><label>Email</label><input type="text" name="email"></p>
        <p><label>Problem</label><input type="text" name="problem"></p>
        <p><label>Description</label><textarea name="description"></textarea></p>
        <p><label>&nbsp;</label><input type="submit" name="help" value="help"></p>
      </form>

    </div>

  </body>
</html>
