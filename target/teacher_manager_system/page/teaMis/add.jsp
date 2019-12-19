<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/19
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>教师信息录入</title>
</head>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<body>
<form>
    *<input type="text" placeholder="请输入教师工号" name="number">
    <br>
    *<input type="text" placeholder="请输入教师姓名" name="name">
    <br>
    *<input type="password" placeholder="请输入教师初始密码" name="password">
    <br>
    *<input type="text" placeholder="请输入教师职称" name="title">
    <br>
    *<input type="text" placeholder="请输入教师权限" name="assessor">
    <br>
    *<input type="text" placeholder="请输入教师所属部门" name="teaDepNum">
    <br>
    *<input type="text" placeholder="请输入教师职务" name="teaJob">
    <br>
    <input type="text" placeholder="请输入教师手机号" name="phone">
</form>
<input type="button" onclick="seria()" value="测试">
</body>
<script>
    function seria() {
        var form={};
        var number=$("#number").val();
        var name=$("#name").val();
        var password=$("#password").val();
        var title=$("#title").val();
        var phone=$("#phone").val();
        var assessor=$("#assessor").val();
        var teaDepNum=$("#teaDepNum").val();
        var teaJob=$("#teaJob").val();
        form["number"]=number;
        form["name"]=name;
        form["password"]=password;
        form["title"]=title;
        form["phone"]=phone;
        form["assessor"]=assessor;
        form["teaDepNum"]=teaDepNum;
        form["teaJob"]=teaJob;
        console.log(form);
    }
</script>

</html>
