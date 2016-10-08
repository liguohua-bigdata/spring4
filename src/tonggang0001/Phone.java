package tonggang0001;

/**
 * Created by liguohua on 4/5/16.
 */
public class Phone {
    private int since;
    private String brand;
    private double price;

    public Phone(int since, String brand, double price) {
        this.since = since;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "age=" + since +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
