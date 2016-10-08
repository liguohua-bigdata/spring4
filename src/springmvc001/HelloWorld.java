package springmvc001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liguohua on 4/10/16.
 */
@Controller
public class HelloWorld {
    /*
        配置UIL解析器,对于InternalResourceViewResolver的解析方式如下:
        prefix+returnVal+suffix来对应实际的物理视图
        本例的物理视图是/WEB-INF/views/springmvc001/hello.jsp
     */

    @RequestMapping("/helloworld")//用于指定可以处理那些URL请求
    public  String hello(){
        final String x = "hello world...spring mvc!";
        System.out.println(x);
        return  "hello";
    }
}
