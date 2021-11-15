package input_output_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public void run() {
        int size;

        try (FileInputStream f = new FileInputStream("test.txt")) {
            System.out.println("Total amount of available bytes " + (size = f.available()));

            int n = size/2;

            System.out.println("First " + n + " bytes, read from the file in turn by method read()");

            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }

            System.out.println("\nStill available: " + f.available());
            System.out.println("Read next " + n + " bytes in turn by method read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.out.println("Can not read " + n + " bytes.");
            }

            System.out.println(new String(b, 0, n));
            System.out.println("\nStill available: " + (size = f.available()));
            System.out.println("Skip half of remaining bytes by method skip()");

            f.skip(size/2);

            System.out.println("Still available: " + f.available());
            System.out.println("Reading " + n/2 + " bytes, placed in the end of array");
            if (f.read(b, n/2, n/2) != n/2) {
                System.err.println("Can't read " + n/2 + " bytes");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill available: " + f.available());

        } catch (IOException e) {
            System.out.println("Input-Output Error: " + e);
        }
    }
}
