package o009factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liguohua on 4/7/16.
 */
public class InstaceFactory {//实例工厂
    public  Map<String, Car> carMap = new HashMap<>();

    public InstaceFactory() {
        carMap.put("audi",new Car("20998.90","23.3"));
        carMap.put("baoma",new Car("30998.90","43.3"));
    }
    //实例工厂方法
    public  Car getCar(String brand) {
        return carMap.get(brand);
    }
}
