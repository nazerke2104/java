import java.util.*;
public class zhol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Мәтінді енгізіңіз: ");
        String matin = sc.nextLine();

        System.out.println(matin.replace(" ", ""));
    }
}
