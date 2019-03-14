<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/13/2019
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation page</title>
</head>
<body>
    <div id="contactForm">
        <p>Thank you!  <%= request.getParameter("name")%> for contacting us. We should receive reply from us with in 24 hrs in your email address ${email }.
        Let us know in our support email ${support_email } if you don’t receive reply within 24 hrs. Please be sure to attach your reference
        ${support_id} in your email.</p>
    </div>
</body>
</html>
