<%--
  Created by IntelliJ IDEA.
  User: liguohua
  Date: 4/3/16
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h7>第一个springMVC程序</h7>
<a href="/helloworld">helloworld</a><br/>

<h7>映射默认情况下的URL</h7>
<a href="/springurl/test1">test1</a><br/>

<h7>映射指定路径的URL</h7>
<a href="/springurl/test2">test2</a><br/>

<h7>映射指定参数的URL</h7>
<a href="/springurl/test3?username='zhangsan'&age=11">test3</a><br/>

<h7>映射ant通配符风格的URL</h7>
<a href="/springurl/test5/asdfa/test">test5</a><br/>

<h7>映射rest风格的URL</h7>
<a href="/springurl/test6/100">test6</a><br/>

<h7>映射指定提交方式的的URL</h7>
<form method="post" action="/springurl/test4">
    <button type="submit" value="提交">提交</button>
</form>


<h7>处理rest风格的URL,用CRUD为例子进行讲</h7>
<form method="post" action="/springurl/create">
    <button type="submit">create</button>
</form>

<a href="/springurl/query/1100">query</a><br/>


<form method="post" action="/springurl/update/1001">
    <input type="hidden" name="_method" value="PUT"/>
    <button type="submit">PUT</button>
</form>

<form method="post" action="/springurl/delete/1001">
    <input type="hidden" name="_method" value="DELETE"/>
    <button type="submit">DELETE</button>
</form>


<h7>*******************************************</h7>
<br/>
<a href="/springurl/testRequestParam?username='zhangsan'&age=11">获取请求参数的实例</a><br/>

<a href="/springurl/testRequestHeader">获取请求header的实例</a><br/>

<a href="/springurl/testCookie">获取请求cookie的实例</a><br/>


<form method="post" action="/springurl/testPOJO">
    username: <input type="text" name="username" value="zhangsan"/><br/>
    password: <input type="text" name="password" value="12345678"/><br/>
    email: <input type="text" name="email" value="123@163.com"/><br/>
    age: <input type="text" name="age" value="18"/><br/>
    province:<input type="text" name="address.province" value="shandong"/><br/>
    city:<input type="text" name="address.city" value="jinan"/><br/>
    <button type="submit">提交</button>
</form>
<a href="/springurl/testServletAPI1">servlet原生API测试1</a><br/>
<a href="/springurl/testServletAPI2">servlet原生API测试2</a><br/>
<a href="/springurl/testModelAndView">ModelAndView测试</a><br/>
<a href="/springurl/testMap">testMap测试</a><br/>
<a href="/springurl/testSessionAttributes">testSessionAttributes测试</a><br/>

<h5>以下是ModelAttribute测试</h5>
<form action="/springurl/testModelAttribute" method="post">
    <input type="hidden" name="id" value="1"/>
    <%--name:<input name="name"/></br>--%>
    age:<input name="age" value="18"/></br>
    email:<input name="email" value="zhangsan@qq.com"/></br>
    address.province:<input name="address.province" value="shandong"/></br>
    address.city:<input name="address.city" value="jinan"/></br>
    <input type="submit" value="Submit"/>
</form>


<a href="/springurl/testJSTP">testJSTP</a><br/>
<br/>

<a href="/springurl/testRedirect">testRedirect</a><br/>
<a href="/springurl/testForward">testForward</a><br/>
<br/>

<a href="/employeelist">employeelist...</a><br/>

</body>
</html>
