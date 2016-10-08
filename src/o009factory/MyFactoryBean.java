package o009factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by liguohua on 4/7/16.
 */
public class MyFactoryBean implements FactoryBean {
    private String price;
    private String height;

    public void setPrice(String price) {
        this.price = price;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override

    public Object getObject() throws Exception {//用此方法返回对象
        // 创建对象
        // return new Car("23432423","22.22");
        return new Car(price, height);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
