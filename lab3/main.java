//1
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        double y = Math.cbrt(Math.exp(2 * x))
                - Math.sin(Math.abs(Math.PI * x / (x + 2.0/3.0)))
                + 1.7;

        System.out.println("f(x) = " + y);
    }
}


//2
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        double y = Math.log(Math.abs(x - 1.5))
                + Math.pow(x, 4.0/5.0)
                + Math.cbrt(Math.exp(3 * x))
                + 4;

        System.out.println("f(x) = " + y);
    }
}
