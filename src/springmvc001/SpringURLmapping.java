package springmvc001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import org.springframework.web.servlet.ModelAndView;
import springmvc001.pojo.Address;
import springmvc001.pojo.Student;
import springmvc001.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * Created by liguohua on 4/10/16.
 */
@Controller
@RequestMapping("/springurl")
@SessionAttributes(value = "user1", types = {String.class, User.class})//可以将user对象既放到requestScope中,又放到sessionScope中
public class SpringURLmapping {
    public static final String SUCCESS = "success";
    public static final String SUCCESS2 = SUCCESS + "2";

    @RequestMapping("/test1")
    public String test1() {
        System.out.println("test1");
        return SUCCESS;
    }

    //value表示URL映射,method指定请求方法
    @RequestMapping(value = "/test2")
    public String test2() {
        System.out.println("test2");
        return SUCCESS;
    }

    //处理必须包含username并且age!=10的请求
    @RequestMapping(value = "/test3", params = {"username", "age!=10"})
    public String test3() {
        System.out.println("test3");
        return SUCCESS;
    }

    //处理ant通配符风格的URL
    @RequestMapping(value = "/test5/*/test")
    public String test5() {
        System.out.println("test5");
        return SUCCESS;
    }

    //处理rest风格的URL
    @RequestMapping(path = "/test6/{id}")
    public String test6(@PathVariable(value = "id") Integer id) {
        System.out.println("test6  id=" + id);
        return SUCCESS;
    }

    //value表示URL映射,method指定请求方法
    @RequestMapping(value = "/test4", method = RequestMethod.POST)
    public String test4() {
        System.out.println("test4");
        return SUCCESS;
    }


    //处理rest风格的URL,用CRUD为例子进行讲解
    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public String create() {
        System.out.println("create");
        return SUCCESS;
    }

    @RequestMapping(path = "/query/{id}", method = RequestMethod.GET)
    public String query(@PathVariable(value = "id") Integer id) {
        System.out.println("query  id=" + id);
        return SUCCESS;
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable(value = "id") Integer id) {
        System.out.println("update  id=" + id);
        return SUCCESS;
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Integer id) {
        System.out.println("delete  id=" + id);
        return SUCCESS;
    }

    /*
    处理请求参数
    @RequestParam用于处理请求参数
    value:表示参数名称
    required:是否是必须
    defaultValue:代表请求参数的默认值
     */
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String un, @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println("testRequestParam...username=" + un + "  age=" + age);
        return SUCCESS;
    }

    /*
    处理请求header
    @RequestHeader
    value:表示header名称
    required:是否是必须
    defaultValue:代表请求header的默认值
     */
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String al) {
        System.out.println("testRequestHeader Accept-Language=" + al);
        return SUCCESS;
    }

    /*
       处理请求cookie
       @CookieValue
       value:表示cookie名称
    */
    @RequestMapping(value = "/testCookie")
    public String testCookie(@CookieValue(value = "JSESSIONID") String id) {
        System.out.println("testCookie JSESSIONID=" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testPOJO")
    public String testPOJO(User user) {
        System.out.println("testPOJO user=" + user);
        return SUCCESS;
    }
    /*
         测试spring支持的servlet原生API
     */

    @RequestMapping("/testServletAPI1")
    public String testServletAPI1(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("testServletAPI1 request=" + request + "  , response=" + response);
        return SUCCESS;
    }

    @RequestMapping("/testServletAPI2")
    public void testServletAPI2(HttpServletRequest request, HttpServletResponse response, Writer writer) throws IOException {
        System.out.println("testServletAPI2 request=" + request + "  , response=" + response);
        writer.write("hello spring mvc");
    }

    /*
    测试ModelAndVie
    实际上是放到了request域对象中
     */

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() throws IOException {
        //1.创建一个modelAndView对象
        String viewName = SUCCESS2;
        ModelAndView modelAndView = new ModelAndView(viewName);
        //2.添加数据到modelAndView
        modelAndView.addObject("time", new Date());//可以在页面中取得此值
        modelAndView.addObject("name", "zhangsan");
        //3.返回modelAndView
        return modelAndView;
    }


    /*
      测试Map向页面传值
     */
    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> classes) throws IOException {
        classes.put("class1", Arrays.asList("zhangsan", "lisi"));
        classes.put("class2", Arrays.asList("wangwu", "zhaoliu"));
        return SUCCESS2;
    }

    /*
       sessionScopeAttributes测试,需要类上的注解@SessionAttributes(value = "user1",types = {String.class,User.class})
       @SessionAttributes("user")
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String, Object> map) throws IOException {
        User user = new User("jack", "jackpass", "jack@qingcheng.com", 26, new Address("shandong", "jinan"));
        map.put("user1", user);
        map.put("home", "caoxian");
        return SUCCESS2;
    }


    /*
        ModelAttribute测试
         @ModelAttribute标记的方法会在springMVC执行任何方法前调用
         执行流行如下:
         1.执行 @ModelAttribute方法,从数据库中生成user对象,并把user对象放入map中.
         2.从map中取出user对象,并把表单的值赋予该user对象.//从map中取出user对象,并将该对象传递给目标方法
         3.将user对象传递给目标方法//用表单的值覆盖user对象
     */
    @ModelAttribute
    public void getStudent(@RequestParam(value = "id", required = false) Integer id, Map<String, Student> map) {
        if (id != null) {
            Student student = new Student(1, "zhangsan", 18, "zhangsan@qq.com", new Address("shandong", "jinan"));
            map.put("student", student);
            System.out.println("ModelAttribute..........." + student);
        }
    }


    /*
        1.查找implicModel,有则返回,无则前进
        2.查找sessionAttribute,有则返回,无则异常
     */
    @RequestMapping(value = "/testModelAttribute")
    public ModelAndView testModelAttribute(@ModelAttribute(value = "student") Student student) {
        System.out.println("student=" + student);
        ModelAndView modelAndView = new ModelAndView(SUCCESS2);
        modelAndView.addObject("student", student);
        return modelAndView;
    }


    @RequestMapping("/testJSTP")
    public String testJSTP() {
        System.out.println("testJSTP ");
        return SUCCESS2;
    }


    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("testRedirect.......");
        return "redirect:/index.jsp";
    }
    @RequestMapping("/testForward")
    public String testForward() {
        System.out.println("testForward.......");
        return "forward:/index.jsp";
    }





}


