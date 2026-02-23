// tap-1
public class tap20 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i % 4 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}