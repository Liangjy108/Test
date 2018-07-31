<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/6/6
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
    <%--获取message，设置用户名已存在提示--%>
    <%
        if (request.getAttribute("message")=="该用户名已存在！"){
    %>
    <script>
        window.alert("您输入的用户名已存在！请重新输入！")
    </script><%}%>
</head>
<body>
<div id="注册界面">
    <form method="post" action="/UserServlet?state=register" id="myForm">
    <table>
        <img class="four" src="views/3.1.gif">
        <p>
            <tr><td>用户名*</td><td><input type="text" name="myName"onblur="checkUserName(this.value);" placeholder="请输入用户名"/></td>
                <%--<td><input type="text" id="username" onblur="checkUserName(this.value);" placeholder="请输入用户名"/></td>--%>
                <td><span id="checkUserNameResult" style="color: red;font-size: 15px;"></span></td>
            </tr>
            <br/>
            <%--<div id="message"></div>--%>
            <tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr>
            <tr><td>密码*</td><td><input type="password" name="myPassword"onblur="checkPassword(this.value);" placeholder="请输入密码" /></td>
                <%--<td><input type="text" id="password" onblur="checkPassword(this.value);" placeholder="请输入密码" /></td>--%>
                <td><span id="checkPasswordResult" style="color: red;font-size: 15px;"></span></td>
            </tr>
            <br/>
            <tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr>
            <tr><td>手机号</td><td><input type="text" name="myPhone"></td></tr>
            <br/>
            <tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr>
            <tr><td>QQ</td><td><input type="text" name="myQQ"></td></tr>
            <br/>
            <tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr><tr>&nbsp;</tr>
            <tr><td>电子邮箱</td><td><input type="text" name="myEmail"></td></tr>
        </p>
        <button class="button4" type="submit">确认注册</button>
    </table>
    </form>
</div>
<script>
    function checkUserName(obj) {
        var username = obj;
        if (username.trim().length == 0) {
            var checkUserNameResult = document.getElementById("checkUserNameResult");
            checkUserNameResult.innerHTML = "用户名不能为空";
            obj.focus();
        }
        else {
            checkUserNameResult.innerHTML = "";
        }
    }
    function checkPassword(obj) {
        var password = obj;
        var checkPasswordResult = document.getElementById("checkPasswordResult");
        if (password.trim().length == 0) {
            checkPasswordResult.innerHTML = "密码不能为空";
            obj.focus();
        } else {
            checkPasswordResult.innerHTML = "";
        }
    }
</script>
<style type="text/css">
    body{background: url("views/3.0.gif") no-repeat;background-size: 100% 100%; }
    table{
        width:400px;
        height:100px;
        border:0;
        position: absolute;
        top: 250px;
        left:520px;
        color: white;
        font-size:20px;
        font-family:"Microsoft Yahei";
    }
    .four{
        position: absolute;
        top:100px;
        left:500px;
    }
    .button4{
        width:115px;
        height:30px;
        border-radius: 3px;
        background:url("views/3.1.gif");
        line-height:30px;
        text-align:center;
        color:#000;
        font-family:"Microsoft Yahei";
        font-size:17px;
        position:absolute;
        top:520px;
        left:700px;
    }
</style>
</body>
</html>
