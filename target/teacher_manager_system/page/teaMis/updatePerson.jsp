<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/24
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="tacher_inf">
    <tr id="t_head">
        <th>教师工号</th>
        <th>教师姓名</th>
        <th>教师密码</th>
        <th>教师职称</th>
        <th>教师电话</th>
        <th>教师操作权限</th>
    </tr>

    <c:forEach var="list" items="${data}" varStatus="status">
    <tr>
        <td>${list.number}</td>
            <td>${list.name}</td>
            <td>${list.password}</td>
            <td>${list.title}</td>
            <td>${list.phone}</td>
            <td>${list.assessor}</td>
    </tr>
    </c:forEach>

    <tr>
        <form action="update" method="post">
            <td><input name="number" type="text" readonly="true" value="${data[0].number}"></td>
    <td><input name="name" type="text" placeholder="教师姓名"></td>
    <td><input name="password" type="text" placeholder="教师密码"></td>
    <td>
        <select id="title" name="title">
            <option value="正高级教师">正高级教师</option>
            <option value="高级教师">高级教师</option>
            <option value="一级教师">一级教师</option>
            <option value="二级教师">二级教师</option>
            <option value="三级教师">三级教师</option>
        </select>
    </td>
    <td><input name="phone" type="text" placeholder="教师手机"></td>
    <td>
        <select id="assessor" name="assessor">
            <option value="0">无审批权限</option>
            <option value="1">信息数理学院</option>
            <option value="2">化工学院</option>
        </select>

    </td>
            <input type="submit" value="提交">
    </form>
    </tr>
</table>
</body>
</html>
