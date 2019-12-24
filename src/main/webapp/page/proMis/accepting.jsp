<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/19
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>科研项目验收</title>
</head>
<body>
<table>
    <tr>
        <th>项目名称</th>
        <th>项目申请人</th>
        <th>项目状态</th>
        <th>项目说明</th>
        <th>操作</th>
    </tr>
    <c:forEach var="list" items="${data}" varStatus="status">
        <tr>
            <td>${list.proName}</td>
            <td>${list.name}</td>
            <td>${list.passFlag}</td>
            <td>${list.remark}</td>
            <td><input type="button" value="审批通过" onclick="submit_tip('${list.proName}')"></td>
        </tr>
    </c:forEach>
</table>
</body>
<script>
    function submit_tip(proName) {
        window.location.href="updateAction?proName="+proName+"&passFlag=审批通过"
    }
</script>
</html>
