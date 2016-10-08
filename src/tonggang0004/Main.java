package tonggang0004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liguohua on 4/6/16.
 * 主要讲解,bean配置之间的继承关系和依赖关系
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext0004.xml");
        //一,bean直接的继承关系
        //1.完全手动装配
        Car car1= (Car) ctx.getBean("car1");
        System.out.println(car1);
        Car car2= (Car) ctx.getBean("car2");
        System.out.println(car2);
        //2.使用bean继承进行装配,子bean可以重写父bean的属
        Car car11= (Car) ctx.getBean("car11");
        System.out.println(car11);
        Car car22= (Car) ctx.getBean("car22");
        System.out.println(car22);
        //3.抽象的父bean不能被实例
        Car car222= (Car) ctx.getBean("car222");
        System.out.println(car222);
        //4.构造方法注入的写法
        Car car2222= (Car) ctx.getBean("car2222");
        System.out.println(car2222);
        //二,bean直接的依赖关系
        Car caru= (Car) ctx.getBean("car-user");
        System.out.println(caru);
        User user= (User) ctx.getBean("user");
        System.out.println(user);
    }
}
