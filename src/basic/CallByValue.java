package basic;

public class CallByValue {

    public static void swap(int x, int y){
        int temp = x;
        y = x;
        x = temp;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("swap() 호출 전 : a = " + a + ", b = " + b);
        swap(a, b);

        System.out.println("swap() 호출 후 : a = " + a + ", b = " + b);
    }
}
