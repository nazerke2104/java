public class y {

    class Processor {

        double frequency;

        Processor(double f) {
            frequency = f;
        }

        void show() {
            System.out.println("Processor frequency: " + frequency + " GHz");
        }
    }

    public static void main(String[] args) {

        Tap_9 c = new Tap_9();
        Processor p = c.new Processor(3.5);

        p.show();
    }
}