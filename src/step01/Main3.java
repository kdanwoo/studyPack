package step01;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] words = sc.nextLine().toLowerCase().toCharArray();

        int cnt[] = new int[26];

        for (int i = 0; i < words.length; i++) {
            cnt[words[i]-'A']++;
        }




    }
}
