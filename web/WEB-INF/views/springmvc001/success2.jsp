<%--
  Created by IntelliJ IDEA.
  User: liguohua
  Date: 4/10/16
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="mft" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<html>
<head>
    <title>Title</title>
    <h5>1.ModelAndView测试</h5>
    ${requestScope.get("name")} <br/>
    ${requestScope.get("time")} <br/>

    <h5>2.testMap测试</h5>
    ${requestScope.get("class1")}<br/>
    ${requestScope.get("class2")}<br/>

    <h5>3.sessionAttributes测试</h5>
    requestScope user: ${requestScope.get("user1")}<br/>
    sessionScope user: ${sessionScope.get("user1")}<br/>
    requestScope home: ${requestScope.get("home")}<br/>
    sessionScope home: ${sessionScope.get("home")}<br/>
    <h5>4.testModelAttribute</h5>
    requestScope stu: ${requestScope.get("student")}<br/>

    <%--<h5>5.testModelAttribute</h5>--%>
    <%--<mft:message key="username"></mft:message><br/>--%>
    <%--<mft:message key="password"></mft:message><br/>--%>


</head>
<body>

</body>
</html>
