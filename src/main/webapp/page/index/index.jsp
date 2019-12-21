<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/19
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员主页</title>
</head>
<body>
<input type="button" value="教师信息管理" onclick="teacher_manage()">
<input type="button" value="科研项目申报" onclick="project_application()">
<input type="button" value="科研项目审批" onclick="project_approval()">
<input type="button" value="科研项目验收" onclick="project_accepting()">
</body>
<script>
    function teacher_manage() {
        window.location.href="../teaIndex/index"
    }
</script>
<script>
    function project_application() {
        window.location.href="../proMis/application"
    }
</script>
<script>
    function project_approval() {
        window.location.href="../proMis/approval"
    }
</script>
<script>
    function project_accepting() {
        window.location.href="../proMis/accepting"
    }
</script>
</html>
