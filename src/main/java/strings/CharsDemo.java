package strings;

public class CharsDemo {
    public void getChars() {
        String s = "THis is demonstration of getChars method";
        int start = 4;
        int end = 8;
        char[] buf = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }

    public void test() {
        String someString = "somestring";

        StringBuilder result = new StringBuilder();

        for (int i = someString.length()-1; i >= 0; i--) {
            result.append(someString.charAt(i));
        }

        System.out.println(result);

    }
}
