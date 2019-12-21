<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/19
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="教师信息录入" onclick="add()">
<input type="button" value="修改教师信息" onclick="update()">
<input type="button" value="查询教师信息" onclick="select()">
</body>
<script>
    function add() {
        window.location.href="add"
    }
</script>
<script>
    function update() {
        window.location.href="update"
    }
</script>
<script>
    function select() {
        window.location.href="select"
    }
</script>
</html>
