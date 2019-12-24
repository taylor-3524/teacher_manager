<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/24
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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


<div >
    <table class="tacher_inf">
        <tr id="t_head">
            <th>教师姓名</th>
            <th>教师工号</th>
            <th>操作</th>
        </tr>
        <c:forEach var="list" items="${data}" varStatus="status">
            <tr>
                <td>${list.name}</td>
                <td>${list.number}</td>
                <td><input value="修改" type="button" onclick="update(${list.number})"></td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
<script>
    function update(number) {
        window.location.href="updateGetPerson?number="+number;
    }
</script>
</html>
