package testdome;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {

        Map<String, Long> stringCountMap = Arrays.stream(products)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        for (String s : products) {
            if (stringCountMap.get(s) == 1) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
    }
}