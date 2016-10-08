package o010annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Object o = null;
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("o010annotation.xml");

        //1.@Component表示是一个bean,不管是哪个层
        o = ctx.getBean("user");
        System.out.println(o);

        //2.@Component("beanName"),表示持久层的bean
        o = ctx.getBean("userRepository");
        System.out.println(o);

        //3.@Service("beanName"),表示服务层的bean
        o= ctx.getBean("userService");
        System.out.println(o);

        //4.@Controller("beanName"),表示控制层的bean
        o= ctx.getBean("userController");
        System.out.println(o);

        //5.配置资源过滤器,见XML
    }
}
