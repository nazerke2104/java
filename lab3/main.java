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



//3
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        double y = Math.tan((5.0/3.0) * x)
                + Math.log(Math.abs(2 * x + 5))
                + 1.8;

        System.out.println("f(x) = " + y);
    }
}


//4
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        double y = Math.cos(5 * x)
                + Math.pow(Math.PI + Math.abs(2 - x), 1.0/7.0);

        System.out.println("f(x) = " + y);
    }
}



//5
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        double y = Math.pow(x, 5)
                + Math.log(Math.sqrt(Math.PI + Math.abs(5 - x)));

        System.out.println("f(x) = " + y);
    }
}



//6
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        int x = sc.nextInt();

        double y = Math.pow(x, 7)
                + (x / 2)
                + (x % 5)
                + Math.exp(5 * x);

        System.out.println("f(x) = " + y);
    }
}
