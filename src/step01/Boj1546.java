package step01;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double arr[] = new double[n];
        double sum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]/arr[arr.length-1] * 100; // 점수 재정의
            sum+=arr[i];
        }

        System.out.println(sum/arr.length); // 평균 출력
    }
}
