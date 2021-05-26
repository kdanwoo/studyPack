package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        
        //Collection 생성
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");

        //배열(Array)로 생성
        String[] arr = new String[]{"a","ab","abc","abcd"};

        List<String> result = list.stream()
                .filter(x ->{ //중간 연산(Intermediate Operations)
                    System.out.println(x + " in filter.");
                    return x.length() >=1;
                }).map(x->{ //중간연산 2
                    System.out.println(x + " in map");
                    return x.toUpperCase();
                }).limit(4) //중간연산
                .collect(Collectors.toList()); //단말연산

        System.out.println(result);

        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.filter(x->{
            System.out.println(x + " in filter");
            return x.length() >=3;
        }).map(x->{
            System.out.println(x + " in map");
            return x.toUpperCase();
        }).limit(4)
        .forEach(System.out::println);



        System.out.println(stringStream);


    }
}
