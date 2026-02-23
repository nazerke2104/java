// tap-1
import java.util.Scanner;

public class tap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Оң сан енгізіңіз: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Рахмет!");
    }
}