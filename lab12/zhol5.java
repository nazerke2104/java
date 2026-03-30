
import java.util.*;
public class zhol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Мәтінді енгізіңіз: ");
        String matin = sc.nextLine();
        System.out.print("Белгілі бір сөз не әріпті енгізіңіз: ");
        String soz = sc.nextLine();

        System.out.println(matin.startsWith(soz));
    }
}
