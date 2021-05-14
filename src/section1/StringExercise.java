package section1;

import java.util.StringTokenizer;

public class StringExercise {

    public static void main(String[] args) {

        String data = "성=KIM&이름=DANU&키=큼";
        StringTokenizer stringTokenizer = new StringTokenizer(data,"&");

        int count = stringTokenizer.countTokens();
        System.out.println("토큰의 개수 : " + count);

//        for(int i=0; i < count ; i++){
//            String token = stringTokenizer.nextToken();
//            System.out.println(token);
//        }

        System.out.println("=============hasMoreTokens() 사용===============");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

    }

}
