package interview;

import java.util.HashMap;
import java.util.Map;

class SolutionHash002 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, String> map = new HashMap<>();

        for(String phone : phone_book){
            map.put(phone, phone);
        }

        for(String num : phone_book){
            for(int i=0; i<num.length();i++){

            }
        }



        return answer;
    }
}
public class Hash002 {
    public static void main(String[] args) {
        String[] strings = {"123", "456", "789"};
        SolutionHash002 hash002 = new SolutionHash002();
        System.out.println(hash002.solution(strings));
    }
}
