<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<a href="http://ecjtu.jx.cn/">go to ecjtu</a><!-- method is GET -->
<form method="post">
    <!-- its better use post in form>,data in not added in the URL-->
    Name :<input type="text" name="name"><br/>
    ID :<input type="text" name="id"><br/>
    <input type="submit" value="send date to server"/>
</form>
</body>
</html>