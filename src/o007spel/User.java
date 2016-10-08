package o007spel;


/**
 * Created by liguohua on 4/6/16.
 */
public class User {
    private String name;
    private Car car;
    private Address address;
    private String info;
    public void setCar(Car car) {
        this.car = car;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", address=" + address +
                ", info='" + info + '\'' +
                '}';
    }
}
