package Lambda;

import java.util.*;

class Student1 {
    String name;
    int age;
    double grade;

    Student1(String n,int a,double g){
        name=n; age=a; grade=g;
    }
}

public class tap14 {
    public static void main(String[] args) {
        List<Student1> list = Arrays.asList(
                new Student1("Arsen",20,85),
                new Student1("Altair",22,75),
                new Student1("Bekzat",21,90)
        );

        list.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println(s.name));
    }
}