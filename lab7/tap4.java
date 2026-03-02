import java.util.Scanner;

public class tap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] C = new double[25];
        double product = 1;
        boolean hasPositive = false;

        for (int i = 0; i < 25; i++) {
            C[i] = sc.nextDouble();
            if (C[i] > 0) {
                product *= C[i];
                hasPositive = true;
            }
        }

        if (hasPositive)
            System.out.println("Оң элементтер көбейтіндісі: " + product);
        else
            System.out.println("Оң элемент жоқ.");

        sc.close();
    }
}