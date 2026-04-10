package Lambda;

import java.util.*;
import java.util.stream.Collectors;

class Student2 {
    String name;
    int age;
    Student2(String n,int a){name=n;age=a;}
}

public class tap16 {
    public static void main(String[] args) {
        List<Student2> list = Arrays.asList(
                new Student2("A",20),
                new Student2("B",20),
                new Student2("C",21)
        );

        Map<Integer,List<Student2>> map =
                list.stream().collect(Collectors.groupingBy(s -> s.age));

        System.out.println(map);
    }
}