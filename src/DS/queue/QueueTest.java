package DS.queue;

import java.util.Queue; //import
import java.util.LinkedList;

class Solution {
    class Printer{
        int property;
        int location;

        public Printer(int location, int property) {
            this.property = property;
            this.location = location;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Printer> printerQueue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) { // print큐에 인덱스번호, 우선순위 삽입
            printerQueue.offer(new Printer(i, priorities[i]));
        }
        while (!printerQueue.isEmpty()) {

            boolean flag = false;
            int com = printerQueue.peek().property;
            for (Printer p : printerQueue) {
                if (com < p.property) { // 맨앞의 수보다 큰 숫자가 존재하면
                    flag = true;
                }
            }

             if (flag) {
                printerQueue.offer(printerQueue.poll());
            } else {// 현재 맨앞의 숫자가 가장 클 때
                if (printerQueue.poll().location == location) {
                    answer = priorities.length - printerQueue.size();
                }
            }
        }
        return answer;
    }
}
public class QueueTest {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1};
        int location = 0;

        Solution solution = new Solution();
        System.out.println(solution.solution(priorities,location));
    }
}
