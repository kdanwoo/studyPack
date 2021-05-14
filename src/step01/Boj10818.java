package step01;

import java.util.Scanner;

public class Boj10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] test = new int[n];
        int min = 0;
        int max = 0;

        for (int i = 0; i < test.length; i++) {
            test[i] = sc.nextInt();
            min = test[0];
            max = test[0];

            if(i>0){
                if(max < test[i]){
                    max = test[i];
                }
                if(min > test[i]){
                    min = test[i];
                }

            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}

