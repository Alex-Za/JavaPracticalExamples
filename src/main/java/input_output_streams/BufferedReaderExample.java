package input_output_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void run() {
        try {
            String str;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter symbols, 'q' - for exit");

            do {
                str = br.readLine();
                System.out.println(str);
            } while (!str.equals("stop"));
        } catch (IOException ex) {
            System.out.println(ex);
        }


    }
}
