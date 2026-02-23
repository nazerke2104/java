// tap-2
public class tap19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                System.out.println("Бірінші сан: " + i);
                break;
            }
        }
    }
}