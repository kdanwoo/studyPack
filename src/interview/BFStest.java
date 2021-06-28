package interview;

import java.util.*;

public class BFStest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 탐색을 시작할 정점의 번호

        Boolean[] visited = new Boolean[n]; // 정점이 0부터 시작하면 0, 1부터 시작한다면 n+1 !

        LinkedList<Integer>[] adjlist = new LinkedList[n]; // 정점이 0부터 시작하면 0, 1부터 시작한다면 n+1 !\

        for (int i = 0; i <= n; i++) { //인접 정점을 정보를 담기위한 객체를 초기화
            adjlist[i] = new LinkedList<Integer>();
        }

        //간선의 개수만큼 -> 해당 정점의 인접 정점에 대한 정보를 입력
        for(int i=0;i<m;i++){
            int num1= sc.nextInt();
            int num2 = sc.nextInt();

            adjlist[num1].add(num2);
            adjlist[num2].add(num1);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(adjlist[i]); // 방문 순서를 위해 오름차순 정렬
        }

        System.out.println("BFS - 인접리스트");
        solution(v, adjlist, visited);
        
    }

    private static void solution(int v, LinkedList<Integer>[] adjlist, Boolean[] visited) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[v] = true;
        queue.add(v);

        Iterator<Integer> iter = adjlist[v].listIterator();
        while(iter.hasNext()) {
            int w = iter.next(); //인접 값
            if(!visited[w]) { //방문한적이 없다면
                visited[w] = true; //방문체크를 하고
                queue.add(w); // 큐에 넣어준다
            }
        }
    }

}
