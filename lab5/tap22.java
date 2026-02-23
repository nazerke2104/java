// tap-2
import java.util.Scanner;

public class tap22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();

        double result;

        if (x < 0) {
            result = Math.sin(x);
        } else if (x <= 1) {
            result = Math.cos(x);
        } else {
            result = Math.tan(x);
        }

        System.out.println("f(x) = " + result);
    }
}