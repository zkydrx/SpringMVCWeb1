<%--
  Created by IntelliJ IDEA.
  User: Abbot
  Date: 2017-11-29
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <p>
    <form id="userId" action="/saveUser" method="post">
        <label id="name">name:</label>
        <input type="text" name="name" id="user_name" value="" /><br/>
        <label id="password">password:</label>
        <input type="password" name="password" id="user_password" value=""/><br/>
        <label id="phone">phone:</label>
        <input type="text" name="phone" id="user_phone" value=""/><br/>
        <label id="email">email:</label>
        <input type="text" name="email" id="user_email" value=""/><br/>
        <label id="address">address:</label>
        <input type="text" name="address" id="user_address" value=""/><br/>
        <input type="reset" id="user_reset" value="reset"/>
        <input type="submit" id="user_summit" value="summit"/>
    </form>
    </p>

</div>
</body>
</html>
