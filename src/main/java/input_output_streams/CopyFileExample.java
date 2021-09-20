package input_output_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileExample {
    public static void run(String filePathToCopy, String filePathToInsert) {
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(filePathToCopy);
            fileOutputStream = new FileOutputStream(filePathToInsert);

            do {
                i = fileInputStream.read();
                if (i != -1) fileOutputStream.write(i);
            } while (i != -1);
        } catch (IOException ex) {
            System.out.println("Exception input-output: " + ex);
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException ex2) {
                System.out.println("Exception while closing input file");
            }
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException ex2) {
                System.out.println("Exception while closing output file");
            }
        }
    }
}
