package interview;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        int val = 0;
        String answer = "";

        for(String part: participant){
            if(!map.containsKey(part)){
                map.put(part,1); //처음에는 다 0으로 해둠.
            }else{
                count = map.get(part) + 1;
                map.put(part, count);
            }
        }

        for(String comp : completion){
            count = map.get(comp) - 1;
            map.put(comp,count);
        }

        for (String key : map.keySet()) {
            if(map.get(key) == 1) answer = key;
        }

        return answer;
    }
}
public class Hash001 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution.solution(participant, completion));
    }
}
