import java.util.Scanner;

public class tap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > -2 && x < 5) {
            f = 5 * x * x + 6;
        } else if (x >= 5) {
            f = x * x * x + 7;
        } else {
            System.out.println("Шартқа сәйкес емес!");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}