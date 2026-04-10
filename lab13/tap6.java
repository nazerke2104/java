package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class tap6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bbbb","c","ddd");

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}