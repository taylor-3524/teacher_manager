<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/19
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>科研项目申报</title>
</head>
<style>
    .remark{
        width: 700px;
        height: 200px;

    }
</style>
<body>
<form action="addAction" method="post">
    <label>项目名称</label>
    <input name="proName" type="text" placeholder="不超过30个中文">
    <br>
    <br>
    <label>详细说明</label>
    <br>
    <textarea rows="7" type="text" name="remark" class="remark" placeholder="项目所需资金，人员，预期等信息"></textarea>
    <br>
    <input type="submit" value="提交申请" onclick="submit_tip()">
</form>
</body>
<script>
    function submit_tip() {
        alert("提交完成！");
    }
</script>
</html>
