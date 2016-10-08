package springmvc001.pojo;

/**
 * Created by liguohua on 4/10/16.
 */
public class Address {
    private String province;
    private String city;

    public Address() {
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }


    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
