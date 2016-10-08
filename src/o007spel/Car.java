package o007spel;

/**
 * Created by liguohua on 4/6/16.
 */
public class Car {
    private String name;
    private double price;
    private  double tyreLen;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTyreLen(double tyreLen) {
        this.tyreLen = tyreLen;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTyreLen() {
        return tyreLen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", tyreLen=" + tyreLen +
                '}';
    }
}
