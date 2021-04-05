package step01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(func1(n));

    }

    private static int func1(int n) {
        int total = 0;
        for(int i=n ;i>0 ; i--){
            if(i%3==0 || i%5==0){
                total = total + i;
            }
        }
        return total;
    } //시간복잡도 O(n)

}
