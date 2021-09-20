package input_output_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderExample {
    public static void run(String filePath) {
        int i;
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        try {
            do {
                i = fileInputStream.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }

        try {
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error closing file");
        }
    }
}
