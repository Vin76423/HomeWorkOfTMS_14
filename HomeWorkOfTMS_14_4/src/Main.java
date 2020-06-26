import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.bin"))) {
            objectOutputStream.writeObject(new Car("Audi", 230, 3450));
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("*****************");



        Car car = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.bin"))) {
            car = (Car) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(car);
    }
}
