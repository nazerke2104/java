import java.util.*;
public class zhol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Мәтінді енгізіңіз: ");
        String matin = sc.nextLine();

        int count = matin.replace(" ", "").length();
        System.out.println("Таңба саны: " + count);
    }
}
