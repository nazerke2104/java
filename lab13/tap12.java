package Lambda;

import java.util.function.Supplier;
import java.util.Random;

public class tap12 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println(random.get());
    }
}