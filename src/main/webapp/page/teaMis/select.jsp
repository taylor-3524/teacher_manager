<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/21
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找教师信息</title>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
</head>
<body>
<label>根据姓名查询教师</label>
<form action="selectByName" method="post">
    <input type="text" placeholder="请输入教师姓名或部分姓名" name="name" id="name">
    <input type="submit" value="查询">
</form>
<br>
<label>根据部门及职务查询教师</label>
<br>
<form action="selectByDepAndJob" method="post">
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


<%--<script>
    function insert_info(msg){
        for(i=0;i<msg.data.length;i++){
            var table=document.createElement("table");

            var tbody = document.createElement("tbody");
            table.appendChild(tbody);


            /*创建tr*/
            var tr=document.createElement("tr");
            tbody.appendChild(tr);
            /*创建td*/
            var td=document.createElement("td");
            td.appendChild(document.createTextNode(msg.data[i].name));
            tr.appendChild(td);
            var td_2=document.createElement("td");
            td.appendChild(document.createTextNode(msg.data[i].number));
            tr.appendChild(td);
            var td_3=document.createElement("td");
            td.appendChild(document.createTextNode(msg.data[i].phone));
            tr.appendChild(td);

        }
    }
    $(function () {
        $("#dep").blur(function () {
            var teaDepNum=$(this).val();
            $("#job").blur(function () {
                var teaJob=$(this).val();
                $.ajax({
                    type:"post",
                    url:"selectByDepAndJob",
                    data:{
                        teaDepNum:teaDepNum,
                        teaJob:teaJob
                    },
                    dataType:"json",
                    success:function (msg) {
                        insert_info(msg);
                    },
                    error: function (e) {
                        console.log(e.status);
                        console.log(e.responseText);
                    }
                });
            })
        })
    })
</script>
<script>
    $(function () {
        $("#name").blur(function () {
            var name=$(this).val();
            $.ajax({
                type:"post",
                url:"selectByName",
                data:{
                    name:name
                },
                dataType:"json",
                success:function (msg) {
                    $("#teaName").text(msg.data[0].name);
                    $("#teaNumber").text(msg.data[0].number);
                    $("#teaPhone").text(msg.data[0].phone);

                },
                error: function (e) {
                    console.log(e.status);
                    console.log(e.responseText);
                }
            });
        });
    })
</script>--%>
</html>
