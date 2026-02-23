import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ай нөмірін енгізіңіз (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: System.out.println("Қаңтар"); break;
            case 2: System.out.println("Ақпан"); break;
            case 3: System.out.println("Наурыз"); break;
            case 4: System.out.println("Сәуір"); break;
            case 5: System.out.println("Мамыр"); break;
            case 6: System.out.println("Маусым"); break;
            case 7: System.out.println("Шілде"); break;
            case 8: System.out.println("Тамыз"); break;
            case 9: System.out.println("Қыркүйек"); break;
            case 10: System.out.println("Қазан"); break;
            case 11: System.out.println("Қараша"); break;
            case 12: System.out.println("Желтоқсан"); break;
            default: System.out.println("Қате ай нөмірі");
        }
    }
}