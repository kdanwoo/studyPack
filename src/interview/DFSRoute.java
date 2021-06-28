package interview;

import java.util.Scanner;

public class DFSRoute {

    static int[][] map; //map을 나타내는 배열
    static int[][] visited;
    static int map_size; //map의 Size
    static int min;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        map_size = Integer.parseInt(scan.nextLine().trim()); //map의 size를 입력받는다.
        map = new int[map_size][map_size]; //

        min = map_size * map_size; //모든 경로를 돌아다녀도 n * n이니, 이를 최소값으로 지정해둔다

        //이동할 수 있는 path를 입력받기 위해 for문을 사용.
        for(int i = 0; i < map_size; i++) {
            for(int j = 0; j < map_size; j++) {
                map[i][j] = scan.nextInt();
            }
        }

        depthfirstSearch(0,0,1);
        System.out.println("최단 거리 : " + min);
    }

    private static void depthfirstSearch(int x, int y, int length){
        if(x == map_size -1 && y == map_size -1){
            if (min > length) min = length;
            return;
        }
        map[y][x] = 0; // 방문했음을 표시하기 위해 0을 대입

    }
}
