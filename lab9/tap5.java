public class tap5 {

    static class Config {

        static String appName = "MyApplication";
        static int version = 1;
    }

    public static void main(String[] args) {

        System.out.println(Config.appName);
        System.out.println("Version: " + Config.version);
    }
}