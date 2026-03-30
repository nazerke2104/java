import java.util.*;
public class zhol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Мәтінді енгізіңіз: ");
        String text = sc.nextLine();

        int dauysty = 0, dauyssyz = 0;
        String dauystylar = "aeiouAEIOUаәеёиоөуүыі";


        for (int i = 0; i < text.length(); i++) {
            // Мәтіннен i-ші орындағы таңбаны аламыз
            char c = text.charAt(i);

            // Таңбаның әріп екенін тексереміз
            if (Character.isLetter(c)) {
                // Егер таңба dauystylar жолының ішінде болса - дауысты
                if (dauystylar.indexOf(c) != -1) {
                    dauysty++;
                } else {
                    // Әріп болып, бірақ dauystylar ішінде болмаса - дауыссыз
                    dauyssyz++;
                }
            }
        }

        System.out.println("Дауысты: " + dauysty);
        System.out.println("Дауыссыз: " + dauyssyz);
    }
}
