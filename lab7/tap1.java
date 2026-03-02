import java.util.Scanner;

public class tap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("20 бүтін сан енгізіңіз:");

        for (int i = 0; i < 20; i++) {
            int number = sc.nextInt();
            if (number < 0) {
                sum += number;
            }
        }

        System.out.println("Теріс элементтер қосындысы: " + sum);
        sc.close();
    }
}