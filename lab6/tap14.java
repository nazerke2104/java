import java.util.Scanner;

public class tap14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x >= -1 && x <= 1) {
            f = Math.cbrt(Math.abs(x) + Math.pow(x, 4));
        } else {
            f = Math.pow(Math.tan(3 * x), 2) + Math.log(5 * x);
        }

        System.out.println("f(x) = " + f);
    }
}