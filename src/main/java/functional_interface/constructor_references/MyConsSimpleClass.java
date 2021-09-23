package functional_interface.constructor_references;

public class MyConsSimpleClass {
    String str;

    public MyConsSimpleClass(String str) {
        this.str = str;
    }

    public MyConsSimpleClass() {
        str = "";
    }

    public String getStr() {
        return str;
    }
}
