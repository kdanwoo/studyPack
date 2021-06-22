package dsmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class SolutionHashTelephone{
    public boolean solution(String[] phone_book) {
        int count = 0;
        Map<String, String> map = new HashMap<>();

        for(String num : phone_book){
            map.put("map",num);
        }

        for(int i=0; i<phone_book.length-1 ; i++){
            for(int j=1 ; j<phone_book.length ; j++){
                //찾기
                
            }
        }



        boolean answer = true;
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
