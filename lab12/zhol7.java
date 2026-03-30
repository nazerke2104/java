import java.util.*;
public class zhol7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Мәтінді енгізіңіз: ");
        String matin = sc.nextLine();

        String reversed = new StringBuilder(matin).reverse().toString();
        System.out.println(reversed);
    }
}
