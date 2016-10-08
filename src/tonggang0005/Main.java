package tonggang0005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liguohua on 4/6/16.
 * 主要讲解,bean的作用域
 */
public class Main {
    public static void main(String[] args) {
        int hashCode =0;
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext0005.xml");
        //1.单例bean,每次获取都使用同一个bean,默认就是单列bean,创建容器时就实例化了单列bean
        hashCode=ctx.getBean("car1").hashCode();
        System.out.println(hashCode);
        hashCode = ctx.getBean("car1").hashCode();
        System.out.println(hashCode);

        //2.原型例bean,每次获取都产生新的bean,每次获取都将调研构造方法
        hashCode=ctx.getBean("car2").hashCode();
        System.out.println(hashCode);
        hashCode = ctx.getBean("car2").hashCode();
        System.out.println(hashCode);

    }
}
