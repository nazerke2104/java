import java.util.Scanner;

public class tap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > 0 && x < 2) {
            f = Math.pow(x, 3) * Math.cos(x);
        } else if (x >= 2 && x <= 5) {
            f = 3 * Math.pow(x, 4) + 7;
        } else if (x > 5 && x <= 9) {
            f = Math.sqrt(5 * x * x + 1.6);
        } else {
            System.out.println("Шартқа сәйкес емес!");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}