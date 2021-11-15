package nio_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputOutputStreams {
    public void runInputStream() {
        int i;
        try (InputStream inputStream = Files.newInputStream(Paths.get("test.txt"))) {
            do {
                i = inputStream.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void runBufferedInputStream() {
        int i;
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(Paths.get("test.txt")))) {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void runOutputStream() {
        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))) {
            for (int i = 0; i < 26; i++) {
                outputStream.write((byte) 'A' + i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
