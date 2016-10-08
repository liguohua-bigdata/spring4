package tonggang0003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by liguohua on 4/5/16.
 * 主要讲解自动装配,实际项目中使用较少.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext0003.xml");
        //1.按名称自动装配
        User user1 = (User) ctx.getBean("user1");
        System.out.println(user1);
        //2.按类型自动装配
        User user2 = (User) ctx.getBean("user2");
        System.out.println(user2);
    }
}
