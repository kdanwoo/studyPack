package dsmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public String solution(String[] participant, String[] completion) {
        int val = 0;
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for (String part: participant) {
            if(map.get(part)==null){
                map.put(part,1);
            }else{
                //중복인 이름일 경우
                val = map.get(part) + 1;
                map.put(part,val);
            }
        }

        for(String comp : completion){
            val = map.get(comp) - 1;
            map.put(comp,val);
        }

        for (String key : map.keySet()) {
            if(map.get(key) == 1) answer = key;
        }

        return answer;
    }
}

public class HashSolution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution.solution(participant, completion));

    }
}
