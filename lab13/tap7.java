package Lambda;

import java.util.Arrays;

public class tap7 {
    public static void main(String[] args) {
        Arrays.asList("apple", "banana")
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);
    }
}