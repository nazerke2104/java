// tap-2
public class tap15 {
    public static void main(String[] args) {

        int[] arr = {4, 7, 10, 15, 22, 9};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Жұп элементтер саны: " + count);
    }
}