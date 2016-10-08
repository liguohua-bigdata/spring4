<%--
  Created by IntelliJ IDEA.
  User: liguohua
  Date: 4/10/16
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎来的springMVC的世界!</h1>


1.配置web.xml
    <!--配置DispatcherServlet-->
    <servlet>
        <servlet-name>springDispatcherServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:springmvc001.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>springDispatcherServlet</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
2.配置springmvc.xml
    <!--配置扫描的包-->
    <context:component-scan base-package="springmvc001"/>
    <!--视图解析器-->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="WEB-INF/views/springmvc001/"/>
        <property name="suffix" value=".jsp"/>
</bean>
3.编写MVC程序
    3.1view成程序的编写，编写一个jps程序
    hello.jsp
    3.2control层的程序编写，编写一个HelloWorld.java
    package springmvc001;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    @Controller
    public class HelloWorld {
    /*
    配置UIL解析器,对于InternalResourceViewResolver的解析方式如下:
    prefix+returnVal+suffix来对应实际的物理视图
    本例的物理视图是/WEB-INF/views/springmvc001/hello.jsp
    */
    @RequestMapping("/helloworld")
    public String hello(){
    final String x = "hello world...spring mvc!";
    System.out.println(x);
    return "hello";
    }
    }
    3.3由框架将HelloWorld.java的返回值对应到hello.jsp，从而生成物理视图

</body>
</html>
