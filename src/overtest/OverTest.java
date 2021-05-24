package overtest;

class OverloadingTest{
    void test1(){
        System.out.println("No Arguments");
    }
    void test1(int a, int b){
        System.out.println("Two Integers Args : "+a+" "+b);
    }
    void test1(String c){
        System.out.println("One String Args : "+c);
    }
}


public class OverTest {
    public static void main(String[] args) {
        OverloadingTest overloadingTest = new OverloadingTest();

        overloadingTest.test1();

        overloadingTest.test1(3,5);

        overloadingTest.test1("TEST OVERLOADING");

    }
}
