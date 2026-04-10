package Lambda;

import java.util.function.BiFunction;
public class tap1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(5, 7));
    }
}
