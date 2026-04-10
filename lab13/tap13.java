package Lambda;

import java.util.*;

class Student {
    String name;
    Student(String name){ this.name = name; }
}

public class tap13 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Bekzat"),
                new Student("Karakoz")
        );

        list.stream()
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println(s.name));
    }
}