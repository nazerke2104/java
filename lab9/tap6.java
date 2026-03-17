public class tap6 {

    static class Config {

        static String name;
        static int version;

        static {
            name = "DemoApp";
            version = 2;
            System.out.println("Static block іске қосылды");
        }
    }

    public static void main(String[] args) {

        System.out.println(Config.name);
        System.out.println(Config.version);
    }
}