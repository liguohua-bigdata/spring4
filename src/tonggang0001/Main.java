package tonggang0001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by liguohua on 4/5/16.
 * 主要讲解,第一个spring的程序!
 */
public class Main {


    public static void main(String[] args) {


        /* 一.setter注入*/
        //1.创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext0001.xml");
        //2.获取对象
        User user = (User) ctx.getBean("user");//用id获取bean
        //User user =atx.getBean(User.class);//用类型获取bean,但是此类型的对象必须唯一.
        //3.使用对象
        user.print();
         /*二.setter方法注入*/
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        /*三.构造方法注入*/
        Phone phone = ctx.getBean(Phone.class);
        System.out.println(phone);
         /*四.注入对象的引用*/
        Driver driver= ctx.getBean(Driver.class);
        System.out.println(driver);
    }
}
