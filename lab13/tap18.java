package Lambda;

import java.util.Arrays;

public class tap18 {
    public static void main(String[] args) {
        Arrays.asList(1,1,2,3,3,4,5)
                .stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }
}