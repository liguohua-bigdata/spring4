package tonggang0001;

/**
 * Created by liguohua on 4/5/16.
 */
public class Driver {
    private String name;
    private Car car;
    private Car car0;//用于测试内部bean
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar0() {
        return car0;
    }

    public void setCar0(Car car0) {
        this.car0 = car0;
    }



    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", car0=" + car0 +
                '}';
    }

}
