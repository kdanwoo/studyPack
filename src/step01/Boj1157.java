package step01;

import java.util.Scanner;

public class Boj1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] wordsUpper = sc.nextLine().toUpperCase().toCharArray();
        int[] count = new int[26];

        for(int i=0;i<wordsUpper.length;i++){
            count[wordsUpper[i]-'A']++;
            //System.out.println(wordsUpper[i]-'A');
        }
        int max = 0;
        int maxIdx = 0;

        for (int i = 0; i < count.length; i++) {
            if(max<count[i]) {
                max = count[i];
                maxIdx = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if(maxIdx!=i) {
                if(max==count[i]) {
                    System.out.println("?");
                    return;
                }
            }
        }

        System.out.println((char)('A'+maxIdx));


    }


}
