<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/6/6
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增增加加</title>
</head>
<body>
<div class="增加页面">
    <table>
        <form method="post" action="${website}person/addPerson">
            <tr><td>Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name"></td></tr>
            <tr><td>&nbsp;&nbsp;</td></tr>
            <tr><td>Birthday&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="birthday"></td></tr>
            <tr><td>&nbsp;&nbsp;</td></tr>
            <tr><td>Department&nbsp;<input type="text" name="department"></td></tr>
            <tr><td>&nbsp;&nbsp;</td></tr>
            <tr><td>Team&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="team"></td></tr>
            <tr><td>&nbsp;&nbsp;</td></tr>
            <tr><td>Comment&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="comment"></td></tr>
            <tr><td>&nbsp;&nbsp;</td></tr>
            <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="确定添加"></td></tr>
        </form>
    </table>
</div>
<style type="text/css">
    body{background: url("/5.0.gif")no-repeat;}
    .增加页面{
        background-color: rgba(255, 255, 255, 0.4);
        position: absolute;
        top:150px;
        left: 550px;
    }
</style>
</body>
</html>
