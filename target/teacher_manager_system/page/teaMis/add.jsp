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
<link type="text/css" rel="stylesheet" href="../css/teaMis_add.css"/>
<body>
<form method="post" action="addAction">

    <label>教师工号</label>
    <input type="text" placeholder="仅限数字" name="number" id="number" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
    <span id="number_tip"></span>
    <br>
    <label>教师姓名</label>
    <input type="text" placeholder="不超过10个中文字符" name="name" />
    <br>
    <label>初始密码</label>
    <input type="password" placeholder="请输入密码" name="password" id="password"/>
    <span class="confirm_password_tip"></span>
    <br>
    <label>确认密码</label>
    <input type="password" placeholder="请再次输入密码" id="confirm_password" name="confirm_password">
    <span class="confirm_password_tip"></span>
    <br>
    <label>教师职称</label>
    <select id="title" name="title">
    <option value="正高级教师">正高级教师</option>
    <option value="高级教师">高级教师</option>
    <option value="一级教师">一级教师</option>
    <option value="二级教师">二级教师</option>
    <option value="三级教师">三级教师</option>
</select>
    <%--<input type="text" placeholder="请输入教师职称" name="title"/>--%>
    <br>
    <label>审批权限</label>
    <select id="assessor" name="assessor">
        <option value="0">无审批权限</option>
        <option value="1">信息数理学院</option>
        <option value="2">化工学院</option>
    </select>
    <%--<input type="text" placeholder="请输入教师权限" name="assessor"/>--%>
    <br>
    <label>所属部门</label>
    <select id="teaDepNum" name="teaDepNum">
        <option value="1">信息数理学院</option>
        <option value="2">化工学院</option>
    </select>
    <br>
    <label>教师职务</label>
    <select name="teaJob">
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
<%--    <input type="text" placeholder="请输入教师职务" name="teaJob"/>--%>
    <br>
    <label>任职情况</label>
    <select name="tenure" id="tenure">
        <option value="在职">在职</option>
        <option value="休假">休假</option>
        <option value="离职">离职</option>
    </select>
    <br>
    <label>教师手机号(选填)</label>
    <input type="text" placeholder="请输入教师手机号" name="phone" value="+86 " />
    <br>
    <input type="submit" value="提交" id="submit_btn">
</form>
</body>
<script>
    $(function () {
        $("#number").blur(function () {
            var number = $(this).val();
            $.ajax({
                type: "post",
                url: "checkNum",
                data: {
                    number: number
                },
                dataType: "json",
                success: function (jsonObject) {
                    if(jsonObject.code!=1){
                        $("#submit_btn").attr('disabled',true);
                        $("#number_tip").text(jsonObject.msg);
                    }else {
                        $("#number_tip").text(jsonObject.msg);
                        $("#submit_btn").attr('disabled',false);
                    }
                },
                error: function (e) {
                    console.log(e.status);
                    console.log(e.responseText);
                }
            });
        });
    })
</script>
<script>
    $(function () {
        $("#confirm_password").blur(function () {
            var password=$("#password").val();
            var confirm_password=$(this).val();
            if(password==confirm_password){
                $("#submit_btn").attr('disabled',false);
                $(".confirm_password_tip").text("");
            }else {
                $("#submit_btn").attr('disabled',true);
                $(".confirm_password_tip").text("密码不一致");
            }
        })
    })
</script>
<script>
    var add_msg =${add_msg};
    if (add_msg != null) {
            alert(add_msg.msg);
    }
</script>
</html>
