package step01;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] words = sc.nextLine().toUpperCase().toCharArray();

        for(int i=0;i<words.length;i++){
            System.out.println(words[i]-'A');
        }


    }


}
