package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {

            System.out.print(listIterator.next() + " ");

        }

        while (listIterator.hasPrevious()) {

            System.out.print(listIterator.previous() + " ");

        }
    }
}
