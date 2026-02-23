// tap-2
import java.util.Scanner;

public class tap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N енгізіңіз: ");
        int n = sc.nextInt();

        int i = 1;
        long fact = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Факториал: " + fact);
    }
}