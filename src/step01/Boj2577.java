package step01;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.util.Scanner;

public class Boj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int result[] = new int[10];

        int total = 1;
        String[] arr2 = null;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            total = total*arr[i];
        }

        arr2 = Integer.toString(total).split("");

        for(int j=0;j< arr2.length;j++){
            if(arr2[j].equals("0")){
                result[0] = result[0]+1;
            }else if(arr2[j].equals("1")){
                result[1] = result[1]+1;
            }else if(arr2[j].equals("2")){
                result[2] = result[2]+1;
            }else if(arr2[j].equals("3")){
                result[3] = result[3]+1;
            }else if(arr2[j].equals("4")){
                result[4] = result[4]+1;
            }else if(arr2[j].equals("5")){
                result[5] = result[5]+1;
            }else if(arr2[j].equals("6")){
                result[6] = result[6]+1;
            }else if(arr2[j].equals("7")){
                result[7] = result[7]+1;
            }else if(arr2[j].equals("8")){
                result[8] = result[8]+1;
            }else if(arr2[j].equals("9")){
                result[9] = result[9]+1;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
