//1
class Student {
    String name;
    int age;
    String major;

    void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("-------------------");
    }
}

//2
class Student {
    String name;
    int age;
    String major;

    // Әдепкі конструктор
    Student() {
        name = "Белгісіз";
        age = 0;
        major = "Белгісіз";
    }

    // Параметрлі конструктор
    Student(String n, int a, String m) {
        name = n;
        age = a;
        major = m;
    }

    void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("-------------------");
    }
}


//3
class Student {
    String name;
    int age;
    String major;

    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("-------------------");
    }
}


//4
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Айдана", 18, "Информатика");
        Student s2 = new Student("Нұрбек", 19, "Математика");
        Student s3 = new Student("Аружан", 20, "Физика");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}



//5
class Student {
    String name;
    int age;
    String major;

    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    void increaseAge() {
        age++;
    }

    void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("-------------------");
    }
}