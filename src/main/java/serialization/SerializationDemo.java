package serialization;

import java.io.*;

public class SerializationDemo {
    public void run() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.txt"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objectOutputStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.txt"))) {

            MyClass object2 = (MyClass) objectInputStream.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
