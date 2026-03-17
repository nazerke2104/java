public class tap2 {

    static class Student {
        String name;
        static String university = "ATU";

        Student(String name) {
            this.name = name;
        }

        void show() {
            System.out.println(name + " оқиды " + university);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ayan");
        Student s2 = new Student("Dana");

        s1.show();
        s2.show();
    }
}