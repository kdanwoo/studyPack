package step01;

import java.util.Scanner;

public class Boj2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            arr[i] = arr[i] * arr[i];
            sum = sum + arr[i];
        }

        System.out.println(sum%10);

    }
}
