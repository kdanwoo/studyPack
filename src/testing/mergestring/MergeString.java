package testing.mergestring;

import java.util.HashSet;
public class MergeString {
    public static String[] uniqueNames(String[] names1, String[] names2) {

        HashSet<String> temp = new HashSet<String>();

        for(String val : names1){
            temp.add(val);
        }

        for(String val : names2){
            temp.add(val);
        }

        String[] result= new String[temp.size()];
        int idx =0;
        for(String val: temp){
            result[idx]=val;
            idx++;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeString.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
