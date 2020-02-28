<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/24
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>修改教师信息</title>
</head>
<body>
<label>请选择需要修改的教师</label>
<br>
<form action="../teaUpd/selectByDepAndJob" method="post">
    <label>选择部门</label>
    <select name="teaDepNum" id="dep">
        <option value="1">信息数理学院</option>
        <option value="2">化工学院</option>
    </select>
    <br>
    <label>选择职务</label>

    <select name="teaJob" id="job">
        <option value="校长">校长</option>
        <option value="书记">书记</option>
        <option value="副校长">副校长</option>
        <option value="校长助理">校长助理</option>
        <option value="学院院长">学院院长</option>
        <option value="系主任">系主任</option>
        <option value="教研室主任">教研室主任</option>
        <option value="总务主任">总务主任</option>
        <option value="教导主任">教导主任</option>
        <option value="普通教师">普通教师</option>
    </select>
    <br>
    <input type="submit" value="查询">
</form>



</body>
</html>
