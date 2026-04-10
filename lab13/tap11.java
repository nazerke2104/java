package Lambda;

import java.util.function.Consumer;

public class tap11 {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println("Value: " + s);
        print.accept("Hello");
    }
}