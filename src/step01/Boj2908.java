package step01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());	// 두 수를 입력 받아 분리
        sc.close();
        int n = st.countTokens();	// 토큰의 갯수 구하기
        int[] result = new int[n];	// 거꾸로 읽은 수을 저장할 배열을 생성하고 토큰의 갯수만큼 길이를 설정'

        for(int i=0; i<n; i++) {	// 입력받은 숫자들을
            String num = st.nextToken();	// 하나씩 분리
            String temp = "";
            int idx = num.length()-1;	// 일의 자리부터 저장하기 위함
            for(int j=idx; j>=0; j--)	// 거꾸로 읽어서 문자열에 저장
                temp += num.charAt(j);
            result[i] = Integer.parseInt(temp);	// 배열에 거꾸로 읽은 숫자 저장
        }

        //값 비교
        if(result[0] > result[1])
            System.out.println(result[0]);
        else
            System.out.println(result[1]);
    }
}
