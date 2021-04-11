package step01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boj3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        Set<Integer> integerSet = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            arr[i] = arr[i]%42;
            integerSet.add(arr[i]);
        }
        System.out.println(integerSet.size());
    }
}
