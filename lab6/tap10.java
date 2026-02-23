import java.util.Scanner;

public class tap10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, f;

        System.out.print("x мәнін енгізіңіз: ");
        x = input.nextDouble();

        if (x > 0 && x <= 2) {
            f = x * x * Math.sin(x) + Math.sqrt(x * x) + 1.2;
        } else if (x > 2 && x <= 6) {
            f = Math.pow(Math.tan(x), 2) + Math.cos(x) + 3.5;
        } else {
            System.out.println("Шартқа сәйкес емес!");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}