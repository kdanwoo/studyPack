package step01;

import java.util.Scanner;

public class Boj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int maxIdx = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx+1);
    }
}
