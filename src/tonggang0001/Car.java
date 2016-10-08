package tonggang0001;

/**
 * Created by liguohua on 4/5/16.
 */
public class Car {
    private int age;
    private String brand;
    private double price;

    public Car() {
    }

    public Car(int age, String brand, double price) {
        this.age = age;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
