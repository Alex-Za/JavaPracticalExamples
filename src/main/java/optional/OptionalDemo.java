package optional;

import java.util.Optional;

public class OptionalDemo {
    public void run() {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABSDC");

        if (noVal.isPresent()) {
            System.out.println("noVal contains value");
        } else {
            System.out.println("noVal doesnt contains value");
        }

        String defaultStr = noVal.orElse("String by default");
        System.out.println(defaultStr);


    }
}
