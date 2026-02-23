import java.util.Scanner;

public class tap15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > 1 && x <= 3) {
            f = Math.pow(x, 3.0/4) + Math.sin(Math.PI * x) + Math.log(x);
        } else {
            f = Math.cbrt(1.5 * x * x - Math.exp(2 * x)) + Math.pow(Math.log(x), 3);
        }

        System.out.println("f(x) = " + f);
    }
}