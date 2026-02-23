import java.util.Scanner;

public class tap13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > 1 && x <= 3) {
            f = Math.sin(5 * x) * (Math.sqrt(1 + x * x) + Math.pow(Math.log(x), 2));
        } else {
            f = Math.exp(x) * Math.cbrt(x + Math.exp(2 * x));
        }

        System.out.println("f(x) = " + f);
    }
}