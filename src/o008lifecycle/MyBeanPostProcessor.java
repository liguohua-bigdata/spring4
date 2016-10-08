package o008lifecycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by liguohua on 4/6/16.
 */
class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //可以改动原有bean,也可以新建bean
        System.out.println("befor init....");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException {
        //可以改动原有bean,也可以新建bean
        System.out.println("after init....");
        return bean;
    }
}
