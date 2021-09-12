package markers;

public class Example {
    public void run() {
        outer: for (int i = 0; i < 3; i++) {
            System.out.println("In outer " + i);
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;
                System.out.println("In inner loop " + j);
            }
        }
    }
}
