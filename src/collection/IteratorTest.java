package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");

        //Iterator 인터페이스를 구현한 클래스의 인스턴스를 반환
        Iterator<String> stringIterator = arrayList.iterator();

        while(stringIterator.hasNext()){
            System.out.print(stringIterator.next()+" ");
        }

        System.out.println();

        for(String a : arrayList){
            System.out.print(a + " ");
        }







    }
}
