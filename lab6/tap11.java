import java.util.Scanner;

public class tap11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > 0 && x <= 4) {
            f = Math.sin(Math.PI * x) + Math.pow(x * x + 6, 1.0/5);
        } else {
            f = Math.log(x) + Math.sqrt(3 * x + 7);
        }

        System.out.println("f(x) = " + f);
    }
}