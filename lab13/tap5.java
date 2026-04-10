package Lambda;

import java.util.Arrays;

public class zad5 {
    public static void main(String[] args) {
        int max = Arrays.asList(5,2,9,1)
                .stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(max);
    }
}