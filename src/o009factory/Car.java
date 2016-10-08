package o009factory;

/**
 * Created by liguohua on 4/6/16.
 */
public class Car {
    private String price;
    private String height;

    public Car(String price, String height) {
        this.price = price;
        this.height = height;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price='" + price + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
