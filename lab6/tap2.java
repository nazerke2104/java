import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x >= 0) {
            f = Math.sqrt(x * x * x + 5);
        } else if (x > -3 && x < 0) {
            f = 3 * Math.pow(x, 4) + 9;
        } else {
            System.out.println("Шартқа сәйкес емес!");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}