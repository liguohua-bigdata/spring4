package tonggang0002;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liguohua on 4/6/16.
 */
public class User {
    private String name;
    private Car car;
    private String[]PhoneNum;
    private List<Car> cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPhoneNum(String[] phoneNum) {
        PhoneNum = phoneNum;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", PhoneNum=" + Arrays.toString(PhoneNum) +
                ", cars=" + cars +
                '}';
    }
}
