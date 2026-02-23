import java.util.Scanner;

public class tap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x < 1.22) {
            f = x * Math.cos(x);
        } else {
            f = 5 * Math.pow(x, 3) + 1.7;
        }

        System.out.println("f(x) = " + f);
    }
}