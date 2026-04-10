package Lambda;

import java.util.Arrays;

public class tap8 {
    public static void main(String[] args) {
        Arrays.asList("hello","stream","java","filtering")
                .stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}