package o008lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by liguohua on 4/6/16.
 * 主要讲解,bean的生命周期
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("o008lifecycle.xml");
         /*
           1.加载容器
           2.constructor被调用
           3.setter被调调用
           4.1.后置处理器中的postProcessBeforeInitialization被调用
           4.2.init-method被调用
           4.3.后置处理器中的postProcessAfterInitialization呗调用
           5.返回bean,使用bean
           6.destroy-method被调用
           7.关闭容器
         */
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        ctx.close();

    }
}
