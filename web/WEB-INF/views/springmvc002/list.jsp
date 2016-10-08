<%--
  Created by IntelliJ IDEA.
  User: liguohua
  Date: 4/21/16
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../../../jquery/jquery-2.2.2.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#deletea").click(function () {
                var href = $(this).attr("href");
                $("#deleteform").attr("action", href).submit()
                return false;
            })
        })
    </script>
</head>
<body>
<form id="deleteform" action="" method="post">
    <input type="hidden" name="_method" value="delete"/>
</form>
list.......
<c:if test="${empty requestScope.employees}">
    没有任何员工信息........
</c:if>
<c:if test="${!empty requestScope.employees}">
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>id</th>
            <th>lastName</th>
            <th>gender</th>
            <th>email</th>
            <th>department</th>
            <th>edit</th>
            <th>delete</th>
        </tr>
        <c:forEach items="${requestScope.employees}" var="emp">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.lastName}</td>
                <td>${emp.gender}</td>
                <td>${emp.email}</td>
                <td>${emp.demparment.departmentName}</td>
                <td><a href="/emp/${emp.id} ">edit</a></td>
                <td><a id="deletea" href="/emp/${emp.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<a href="emp"> add a employee</a>
</body>
</html>
