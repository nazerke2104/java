public class tap11 {

    class Engine {

        int power;

        Engine(int power) {
            this.power = power;
        }

        void show() {
            System.out.println("Engine power: " + power + " HP");
        }
    }

    public static void main(String[] args) {

        Tap_11 car = new Tap_11();
        Engine e = car.new Engine(200);

        e.show();
    }
}