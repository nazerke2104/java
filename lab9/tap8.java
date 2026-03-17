
public class tap8 {

    class Student {

        String name;
        String major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void show() {
            System.out.println(name + " - " + major);
        }
    }

    public static void main(String[] args) {

        Tap_8 u = new Tap_8();
        Student s = u.new Student("Ayan", "IT");

        s.show();
    }
}