import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private int sped;
    private int price;


    public Car(String model, int sped, int price) {
        this.model = model;
        this.sped = sped;
        this.price = price;
    }

    public Car() {
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSped() {
        return sped;
    }

    public void setSped(int sped) {
        this.sped = sped;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model = " + model + '\'' +
                ", sped = " + sped +
                ", price = " + price +
                '}';
    }
}
