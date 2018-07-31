<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/6/6
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--当服务器向浏览器发送文档时，会先发送许多名称/值对，下面这句话的就是--%>
    <%--向服务器发送了名称/值对：content-type: text/html，这将告诉浏览器准备接受一个HTML文档。--%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆界面</title>
        <%--获取info1，设置用户名错误提示--%>
    <%
        if (request.getAttribute("info1")=="用户不存在！"){
    %>
    <script>
        window.alert("您输入的用户名不存在！请重新输入！")
    </script><%}%>
    <%--获取info1，设置密码错误提示--%>
    <%if
        (request.getAttribute("info1")=="错误：密码错误！"){
    %>
    <script>
        window.alert("您输入的密码有误！请重新输入！")
    </script>
        <%}%>
        <%--获取info2，设置密码错误提示--%>
        <%
            if (request.getAttribute("info2")=="退出登陆"){
        %>
        <script>
            window.alert("您已成功退出登陆！")
        </script><%}%>
        <%--获取message，设置成功注册提示--%>
        <%
            if (request.getAttribute("message")=="您已成功注册"){
        %>
        <script>
            window.alert("您已成功注册！")
        </script><%}%>


</head>
<body>
<div id="登陆界面">
    <img class="two" src="views/2.1.gif">
    <img class="three" src="views/2.2.gif">
    <form method="post" action="/UserServlet?state=login">
    <table>
        <p>
            <tr><td>用户名</td><td><input type="text" name="userName"></td></tr>
            <tr><td>密&nbsp;&nbsp;&nbsp;码</td><td><input type="password" name="password"></td></tr>
            <br/>
        </p>
        <button class="button3" type="submit">确认登陆</button>
    </table>
    </form>
</div>
<style type="text/css">
    body{background: url("views/2.0.gif") no-repeat;background-size: 100% 100%;}
    table{
        width:400px;
        height:100px;
        border:0;
        position: absolute;
        top: 350px;
        left:550px;
        color: white;
        font-size:20px;
        font-family:"Microsoft Yahei";
    }
    .two{
        position: absolute;
        top:130px;
        left:530px;
    }
    .three{
        position: absolute;
        top:180px;
        left:650px;
    }
    .button3{
        width:115px;
        height:25px;
        border-radius: 3px;
        background:url("views/2.1.gif");
        line-height:30px;
        text-align:center;
        color:#000;
        font-family:"Microsoft Yahei";
        font-size:17px;
        position:absolute;
        top:480px;
        left:700px;
    }
</style>
</body>
</html>
