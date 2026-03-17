public class tap7 {

    class Inner {

        void show() {
            System.out.println("Inner class жұмыс істейді");
        }
    }

    public static void main(String[] args) {

        Tap_7 outer = new Tap_7();
        Tap_7.Inner in = outer.new Inner();

        in.show();
    }
}