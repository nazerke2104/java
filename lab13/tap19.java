package Lambda;

import java.util.*;

public class tap19 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}