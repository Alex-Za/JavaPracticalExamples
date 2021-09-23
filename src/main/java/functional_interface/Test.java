package functional_interface;

public class Test {
    private String stringTest(FunctionalInterfaceTest fit, String s) {
        return fit.func(s);
    }

    public void run() {
        String inStr = "Some string";
        String outStr = stringTest((str) -> str.toUpperCase(), inStr);
        System.out.println("This string lovercase: " + outStr);

        outStr = stringTest((str) -> {
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != ' ')
                    result += str.charAt(j);
            }
            return result;
        }, inStr);
        System.out.println("This string with deleted spaces" + outStr);

        FunctionalInterfaceTest test = String::toLowerCase;
        System.out.println(test.func("HELLO"));


    }
}
