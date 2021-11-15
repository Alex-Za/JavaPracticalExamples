package input_output_streams;

import java.io.*;

public class DataIODemo {
    public void run() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test.txt"))) {

            dataOutputStream.writeDouble(98.6);
            dataOutputStream.writeInt(1000);
            dataOutputStream.writeBoolean(true);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test.txt"))) {

            double d = dataInputStream.readDouble();
            int i = dataInputStream.readInt();
            boolean b = dataInputStream.readBoolean();

            System.out.println("Getting value: " + d + " " + i + " " + b);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
