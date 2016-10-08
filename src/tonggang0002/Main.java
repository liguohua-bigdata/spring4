package tonggang0002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by liguohua on 4/5/16.
 * 主要讲解spring的对集合的注入
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext0002.xml");
        //1.不使用命名空间
        Driver driver = (Driver) ctx.getBean("driver");
        System.out.println(driver);
        //2.使用util命名空间
        Driver driver2 = (Driver) ctx.getBean("driver2");
        System.out.println(driver2);
        Driver driver3 = (Driver) ctx.getBean("driver3");
        System.out.println(driver3);
        //3.使用p命名空间
        User user = (User) ctx.getBean("user");
        System.out.print(user);
    }
}
