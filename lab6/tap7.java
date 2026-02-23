import java.util.Scanner;

public class tap7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > 0 && x < 1) {
            f = Math.sqrt(Math.pow(x, 3)) + 4 + Math.cos(x);
        } else {
            f = 5 - Math.pow(Math.sin(x), 2) * 9;
        }

        System.out.println("f(x) = " + f);
    }
}