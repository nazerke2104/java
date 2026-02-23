// tap-1
public class tap18 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 13 == 0) {
                System.out.println("13-ке бөлінетін сан табылды: " + i);
                break;
            }

            System.out.println(i);
        }
    }
}