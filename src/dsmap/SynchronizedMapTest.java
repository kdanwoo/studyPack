package dsmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("1","first");
        map.put("2","second");
        map.put("3","third");

        // create a synchronized map
        Map<String,String> synchronizedMap = Collections.synchronizedMap(map);

        System.out.println("Synchronized map is : "+synchronizedMap);
    }
}
