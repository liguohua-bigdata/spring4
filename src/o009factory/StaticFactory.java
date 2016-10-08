package o009factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liguohua on 4/7/16.
 */
public class StaticFactory {//静态工厂
    public static Map<String, Car> carMap = new HashMap<>();
    static {
        carMap.put("audi",new Car("20998.90","23.3"));
        carMap.put("baoma",new Car("30998.90","43.3"));
    }
    //静态工厂方法
    public static Car getCar(String brand) {
        return carMap.get(brand);
    }
}
