<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: liguohua
  Date: 4/21/16
  Time: 10:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--使用spring的表单标签,可以帮助我们快速开发spring页面,也能帮助我们处理回显--%>
<%--modelAttribute的默认值是commond">--%>
<form:form action="${pageContext.request.contextPath}/emp" method="post" modelAttribute="employee">
    <%--path属性对应HTML的name属性--%>
    <c:if test="${employee.id ==null}">
        lastName:<form:input path="lastName"/><br/>
    </c:if>
    <c:if test="${employee.id !=null}">
        <form:hidden path="id"/>
        <input type="hidden" name="_method" value="put"/>
    </c:if>
    email:<form:input path="email"/><br/>

    <%
        Map<String, String> genders = new HashMap<>();
        genders.put("0", "male");
        genders.put("1", "female");
        request.setAttribute("genders", genders);
    %>
    gender:<form:radiobuttons path="gender" items="${genders}"></form:radiobuttons><br/>
    <%--items="${departmentsx}"EmployeeHandler.input()的代码 map.put("departmentsx", departmentDAO.getDepartments());--%>
    <%--itemLabel="departmentName" itemValue="id"指的是Department.class中的属性--%>
    departments:<form:select path="demparment.id" items="${departments}" itemLabel="departmentName"
                             itemValue="id"/><br/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
