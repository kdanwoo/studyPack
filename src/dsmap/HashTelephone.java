package dsmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class SolutionHashTelephone{
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, String> map = new HashMap<>();

        for(String num : phone_book){
            map.put(num,num);
        }

        for(String num : phone_book){
            for(int i=0 ; i<num.length(); i++) {
                if( map.containsKey(num.substring(0,i)) ) {
                    return false;
                }
            }
        }

        return answer;
    }
}


public class HashTelephone {
    public static void main(String[] args) {
        String[] strings = {"119", "97674223", "1195524421"};

        SolutionHashTelephone solutionHashTelephone = new SolutionHashTelephone();

        System.out.println(solutionHashTelephone.solution(strings));
    }
}
