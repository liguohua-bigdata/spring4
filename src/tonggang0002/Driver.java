package tonggang0002;

import java.util.*;

/**
 * Created by liguohua on 4/5/16.
 */
public class Driver {
    //spring在对集合进行注入时,无需创建集合对象本身.
    private String name;
    private String[] phoneNums3;
    private Car[] cars3;

    private List<String> phoneNums;
    private List<Car> cars;

    private Set<String> phoneNums2;
    private Set<Car> cars2;


    private Map<String, Car> carMap;
    private Map<Car, String> carMap2;
    private Properties driverPros;

    public void setName(String name) {
        this.name = name;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setPhoneNums(List<String> phoneNums) {
        this.phoneNums = phoneNums;
    }

    public void setPhoneNums2(Set<String> phoneNums2) {
        this.phoneNums2 = phoneNums2;
    }

    public void setCars2(Set<Car> cars2) {
        this.cars2 = cars2;
    }

    public void setPhoneNums3(String[] phoneNums3) {
        this.phoneNums3 = phoneNums3;
    }

    public void setCars3(Car[] cars3) {
        this.cars3 = cars3;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    public void setCarMap2(Map<Car, String> carMap2) {
        this.carMap2 = carMap2;
    }

    public void setDriverPros(Properties driverPros) {
        this.driverPros = driverPros;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", phoneNums3=" + Arrays.toString(phoneNums3) +
                ", cars3=" + Arrays.toString(cars3) +
                ", phoneNums=" + phoneNums +
                ", cars=" + cars +
                ", phoneNums2=" + phoneNums2 +
                ", cars2=" + cars2 +
                ", carMap=" + carMap +
                ", carMap2=" + carMap2 +
                ", carpros=" + driverPros +
                '}';
    }
}
