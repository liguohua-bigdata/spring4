package o012aop001;

import o011generic_di.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liguohua on 4/7/16.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("o012aop001.xml");
        Caculator c = (Caculator) ctx.getBean("caculator");
        double r = c.add(1, 2);
        System.out.println(r);

    }
}
