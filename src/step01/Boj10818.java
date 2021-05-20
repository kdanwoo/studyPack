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
        }
        max = min = test[0];	// 배열의 첫번째 값을 최소값 및 최대값으로 지정

        for(int i=1; i<test.length; i++) {	// 배열의 두번째 값부터 마지막 값까지 비교
            if(test[i] > max)
                max = test[i];
            if(test[i] < min)
                min = test[i];
        }

        System.out.print(min+" "+max);


    }
}

