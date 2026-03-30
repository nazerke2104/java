import java.util.*;
public class zhol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Мәтінді енгізіңіз: ");
        String matin = sc.nextLine();

        String[] sozder = matin.split(" ");
        String uzyn = "";


        for (int i = 0; i < sozder.length; i++) {
            // words[i] - массивтің i-ші элементі
            if (sozder[i].length() > uzyn.length()) {
                uzyn = sozder[i];
            }
        }

        System.out.println("Ең ұзын сөз: " + uzyn);
    }
}
