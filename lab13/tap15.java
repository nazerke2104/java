package Lambda;
import java.util.Arrays;

public class tap15 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5)
                .stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .forEach(System.out::println);
    }
}
