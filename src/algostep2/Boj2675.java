package algostep2;

import java.util.Scanner;

public class Boj2675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCase = sc.nextInt();

        int r[] = new int[totalCase];
        String s[] = new String[totalCase];

        for(int i =0 ;i<totalCase;i++){
            r[i] = sc.nextInt();
            s[i] = sc.next();
        }

        for(int i =0 ; i<totalCase; i++){
            for(int j=0; j<s[i].length(); j++){
                char c= s[i].charAt(j);
                for(int k=0; k<r[i];k++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }

    }


}
