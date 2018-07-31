<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 迁旧。111
  Date: 2018/6/14
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>搜搜索索</title>
</head>
<body>
        <div class="查询页面">
            <form action="${website}person/selectPerson" method="post">
                <table>
                    <tr><td>id</td>&nbsp;&nbsp;<td>name</td>&nbsp;&nbsp;<td>birthday</td>&nbsp;&nbsp;<td>department</td>&nbsp;&nbsp;<td>team</td>&nbsp;&nbsp;<td>comment</td></tr>
                    <c:forEach items="${resultList}" var="person" varStatus="status">
                        <tr>
                            <td>${status.index+1}</td>
                            <td>${person.name}</td>
                            <td>${person.birthday}</td>
                            <td>${person.department}</td>
                            <td>${person.team}</td>
                            <td>${person.comment}</td>
                        </tr>
                    </c:forEach>

                </table>
            </form>
            <tr><td><a href="/person/list"><input type="submit" value="返回主页"></a> </td></tr>
        </div>
        <style type="text/css">
            body{background: url("/5.0.gif")no-repeat;}
            .查询页面{
                background-color: rgba(255, 255, 255, 0.4);
                position: absolute;
                top:150px;
                left: 380px;
            }
        </style>
    </body>
</html>