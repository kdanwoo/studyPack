package section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayRemoveReduplication {
    public static void main(String[] args) {
        System.out.println("정렬전");
        System.out.println("-----------------------");
        String[] sArr = {"1", "2", "3", "4", "4", "5"};

        for (String data: sArr) {
            System.out.println(data + " ");
        }
        System.out.println("-----------------------");

        List<String> list = new ArrayList<String>();

        for(int i =0 ; i<sArr.length; i++){
            if(!list.contains(sArr[i])){
                list.add(sArr[i]);
            }
        }

        Collections.sort(list);
        System.out.println("정렬후");
        System.out.println("-----------------------");
        for(String i : list)
            System.out.print(i + " ");

    }
}
