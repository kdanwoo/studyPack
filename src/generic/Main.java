package generic;

public class Main {
    public static void main(String[] args) {
        TestGeneric<String> stringType = new TestGeneric<String>();
        TestGeneric<Integer> intergerType = new TestGeneric<Integer>();

        stringType.sample = "Hello";
        intergerType.sample = 1;

        stringType.showType();
        intergerType.showType();
    }
}
