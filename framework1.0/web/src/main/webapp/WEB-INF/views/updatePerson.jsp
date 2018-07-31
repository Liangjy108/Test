<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/6/7
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:useBean id="person" scope="page" class="com.entity.person.Person"/>--%>
<html>
<head>
    <title>修修改改</title>
</head>
<body>
<div class="修改页面">
    <table>
        <form action="${website}person/updatePerson?id=<%=request.getParameter("id")%>" method="post">
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
            <tr><td><input type="submit" value="确定修改"></td></tr>
        </form>
    </table>
</div>
<style type="text/css">
    body{background: url("/5.0.gif")no-repeat;}
    .修改页面{
        background-color: rgba(255, 255, 255, 0.4);
        position: absolute;
        top:150px;
        left: 550px;
    }
</style>
</body>
</html>
