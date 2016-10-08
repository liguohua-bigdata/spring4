package tonggang0003;

/**
 * Created by liguohua on 4/5/16.
 */
public class Car {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
