package dsmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //Map 선언
        Map<String, Double> productPrice = new HashMap<>();

        productPrice.put("Rice", 6.9);
        productPrice.put("Flour", 3.9);
        productPrice.put("Sugar", 4.9);
        productPrice.put("Milk", 3.9);
        productPrice.put("Egg", 1.9);

        //get Value
        Double egg = productPrice.get("Egg");
        System.out.println("The price of Egg is: " + egg);

        Set<String> keys = productPrice.keySet();

        //print all the keys
        for (String key : keys) {
            System.out.println(key);
        }
        // or
        keys.forEach(key -> System.out.println(key));

        //모든 value 값
        Collection<Double> values = productPrice.values();
        values.forEach(value -> System.out.println(value));

        //모든 key, value 같이 출력
        Set<Map.Entry<String, Double>> entries = productPrice.entrySet();

        for (Map.Entry<String, Double> entry : entries) {
            System.out.print("key: "+ entry.getKey());
            System.out.println(", Value: "+ entry.getValue());
        }

        // or (lambda expression)
        productPrice.forEach((key, value) -> {
            System.out.print("key: "+ key);
            System.out.println(", Value: "+ value);
        });


    }
}
