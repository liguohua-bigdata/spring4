package o007spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by liguohua on 4/6/16.
 * 主要讲解,spring的spel表达式
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("o007spel.xml");
        //1.使用spel表达式给bean的属性赋字面值
        Address address = (Address) ctx.getBean("address");
        System.out.println(address);
        //2.使用spel引用类的静态属性和方法
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        //3.使用spel引用其他的bean,或其他bean的属性(实际调研getter方法)
        User user = (User) ctx.getBean("user");
        System.out.println(user);

    }
}
