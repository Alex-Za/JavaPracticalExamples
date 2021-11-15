package scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

    public void testFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers for counting average value");

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            } else {
                String str = scanner.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("Error of data format");
                    return;
                }
            }
        }

        scanner.close();
        System.out.println("Average value " + sum / count);
    }

    public void testFromFile() {
        int count = 0;
        double sum = 0.0;

        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("2 3,4 5 6 7,4 9,1 10,5 done");
            fileWriter.close();
            FileReader fileReader = new FileReader("test.txt");
            Scanner src = new Scanner(fileReader);

//            src.useDelimiter(", *");  use other delimiter for parsing

            while (src.hasNext()) {
                if (src.hasNextDouble()) {
                    sum += src.nextDouble();
                    count++;
                } else {
                    String str = src.next();
                    if (str.equals("done")) {
                        break;
                    } else {
                        System.out.println("Format file error");
                        return;
                    }
                }
            }

            src.close();
            System.out.println("Average value " + sum / count);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void findLineDemo() {
        String instr = "Name: Tom age: 28 ID: 77";
        Scanner scanner = new Scanner(instr);

        scanner.findInLine("age:");
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
        } else {
            System.out.println("Error!");
        }
        scanner.close();
    }

}
