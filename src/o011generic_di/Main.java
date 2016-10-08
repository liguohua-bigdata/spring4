package o011generic_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liguohua on 4/7/16.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("o011generic_di.xml");
        UserService userService= (UserService) ctx.getBean("userService");
        userService.save();

    }
}
