<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/7/29
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NBA no NB</title>


</head>
<body>
<div class="主页面">
<table>
        <%--table表单 即数据库中的所有NBA人员信息--%>
    <tr><td>id</td>&nbsp;&nbsp;<td>name</td>&nbsp;&nbsp;<td>birthday</td>&nbsp;&nbsp;<td>department</td>&nbsp;&nbsp;<td>team</td>&nbsp;&nbsp;<td>comment</td></tr>
            <%--遍历所有的person--%>
            <c:forEach items="${personList}" var="person" varStatus="status">
            <tr>
            <td>${status.index+1}</td>
            <td>${person.name}</td>
            <td>${person.birthday}</td>
            <td>${person.department}</td>
            <td>${person.team}</td>
            <td>${person.comment}</td>
            <td><a href="${website}person/toupdatePerson?id=${person.id}"><button class="button5">修改</button> </a></td>
            <td><a href="${website}person/delPerson?id=${person.id}"><button class="button6">删除</button> </a></td>
        </tr>
    </c:forEach>
</table>
</div>
<a href="${website}person/toadd"><button class="button7">增&nbsp;加</button></a>
<div class="搜索框">
    <form action="${website}person/selectPerson" method="post">
        <input type="text" name="keyWord" class="search_key" placeholder="搜索内容">
        <input type="submit" name="name" value="搜索" class="search_btn">
    </form>
</div>
<%--css样式--%>
<style type="text/css">
    body{background: url("/4.0.gif") no-repeat;background-size: 100% 100%;}
    table tr td,th{border:1px; solid:#ffffff;}
    .button7{
        position:absolute;
        top:170px;
        left:1000px;
    }
    .button8{
        position:absolute;
        top:170px;
        left:1060px;
    }
    .主页面{
        /*背景颜色40%透明度*/
        background-color: rgba(255, 255, 255, 0.4);
        position: absolute;
        top:200px;
        left: 250px;
    }
    .搜索框{
        position: absolute;
        top: 170px;
        left: 790px;
    }
</style>

</body>
</html>