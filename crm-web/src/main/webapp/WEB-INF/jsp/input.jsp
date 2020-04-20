<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/19
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户录入页面</title>
</head>
<body>
    <form method="post" action="/crm/bootuser/save.do">
        用户名:<input type="text" name="name"><br>
        密码:<input type="password" name="password"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
