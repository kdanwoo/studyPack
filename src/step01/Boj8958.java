package step01;

import java.util.Scanner;

public class Boj8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            String tempData = sc.next();
            String[] splited = tempData.split("");
            int total = 0;
            int count = 0;

            for (int j = 0; j < splited.length; j++) {
                if(splited[j].equals("O")){
                    if(j==0){
                        total = total + 1;
                        count = 0;
                    }else{ //연속해서 맞은 경우
                        if(splited[j-1].equals("O")){
                            count++;
                            total = total + 1 + count;
                        }else{ //연속해서 맞은 경우가 아니면
                            total = total + 1;
                            count = 0;
                        }
                    }
                }else{
                    count = 0;
                }
            }
            result[i] = total;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
