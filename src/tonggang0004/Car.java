package tonggang0004;

/**
 * Created by liguohua on 4/6/16.
 */
public class Car {
    private String name;
    private String brand;
    private double price;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
