import java.util.Scanner;

public class tap8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > -5 && x < 0) {
            f = Math.sqrt(x * x) + Math.abs(x);
        } else if (x >= 0 && x < 2) {
            f = 5 * Math.pow(x, 3) + Math.cos(x);
        } else {
            System.out.println("Шартқа сәйкес емес!");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}