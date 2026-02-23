import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > -4 && x <= 5) {
            f = Math.cbrt(x * x) + 3 + 6 * x * x;
        } else if (x > 5) {
            f = Math.pow(x, 5) + 3.5;
        } else {
            System.out.println("Шартқа сәйкес емес!");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}