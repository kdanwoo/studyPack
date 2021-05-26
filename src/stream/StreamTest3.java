package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd","abc","addef");

        List<String> newList =list.stream()
                .filter(s->s.length()>=4)
                .map(s-> "["+s+"]")
                .collect(Collectors.toList()); //객체 생성

        newList.forEach(System.out::println);
    }
}
