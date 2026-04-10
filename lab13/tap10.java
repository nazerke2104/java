package Lambda;

import java.util.Arrays;

public class tap10 {
    public static void main(String[] args) {
        int min = Arrays.asList(4,1,9)
                .stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}