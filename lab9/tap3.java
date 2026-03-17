public class tap3 {

    static class MathUtils {

        static int square(int x) {
            return x * x;
        }

        static int cube(int x) {
            return x * x * x;
        }
    }

    public static void main(String[] args) {

        System.out.println("Square: " + MathUtils.square(5));
        System.out.println("Cube: " + MathUtils.cube(3));
    }
}