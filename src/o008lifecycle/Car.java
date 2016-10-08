package o008lifecycle;

/**
 * Created by liguohua on 4/6/16.
 */
public class Car {
    private String brand;
    public  void  init(){
        System.out.println("bean's init....");
    }
    public  void  destory(){
        System.out.println("bean's destory....");
    }
    public Car() {
        System.out.println("bean's constructor....");
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("setter");
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
