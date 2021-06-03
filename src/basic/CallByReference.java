package basic;

public class CallByReference {
    int value;

    public CallByReference(int value) {
        this.value = value;
    }

    public static void swap(CallByReference a, CallByReference b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        CallByReference x = new CallByReference(1);
        CallByReference y = new CallByReference(2);
        System.out.println("swap() 호출 전 : a = " + x.value + ", b = " + y.value);
        swap(x, y);
        System.out.println("swap() 호출 전 : a = " + x.value + ", b = " + y.value);
    }
}
