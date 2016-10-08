package o009factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by liguohua on 4/6/16.
 * 主要讲解,用工厂方法的对象在spring中的配置
    总结:
    spring创建对象有三种方式
        1.用全类名创建对象,反射机制
        2.用工厂方法创建对象,new对象
           a. 静态工厂方法创建对象
           b. 实例工厂方法创建对象
        3.用FactroyBean创建对象,new对象
*/
public class Main {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("o009factory.xml");
        //1.静态工厂方法创建对象
        Car car = (Car) ctx.getBean("car1");
        System.out.println(car);
        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        //2.实例工厂方法创建对象
        car = (Car) ctx.getBean("car3");
        System.out.println(car);
        car = (Car) ctx.getBean("car4");
        System.out.println(car);

        //2.FactoryBean的创建对象
        car = (Car) ctx.getBean("car5");
        System.out.println(car);
        car = (Car) ctx.getBean("car6");
        System.out.println(car);







    }
}
