// tap-2
import java.util.Scanner;

public class tap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 – Хабарлама");
            System.out.println("2 – Қосу");
            System.out.println("3 – Шығу");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Сәлем!");
                    break;
                case 2:
                    System.out.println("2 + 2 = " + (2 + 2));
                    break;
                case 3:
                    System.out.println("Бағдарлама аяқталды");
                    break;
                default:
                    System.out.println("Қате таңдау");
            }
        } while (choice != 3);
    }
}