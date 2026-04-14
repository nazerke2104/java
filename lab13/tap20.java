package Lambda;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    String name;
    double price;

    Order(String n,double p){
        name=n; price=p;
    }
}

public class tap20 {
    public static void main(String[] args) {
        List<Order> list = Arrays.asList(
                new Order("Phone",500),
                new Order("Laptop",1200),
                new Order("Mouse",20)
        )

        List<String> result = list.stream()
                .filter(o -> o.price > 100)
                .map(o -> o.name)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}