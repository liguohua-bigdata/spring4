package tonggang0003;


/**
 * Created by liguohua on 4/6/16.
 */
public class User {
    private String name;
    private Car car;
    private Address address;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", address=" + address +
                '}';
    }
}
