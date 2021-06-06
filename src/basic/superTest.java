package basic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class superTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.childTest();
    }
}

class Parent{
    int data2 = 1;
    int data3 = 3;

    public Parent(int data2, int data3) {
        // 생성자의 첫줄에 다른 생성자를 호출하지 않았기 때문에,
        // 컴파일러가 이 부분에 super()를 호출합니다.
        // 부모 클래스이므로 Object 클래스의 super()가 호출됩니다.
        this.data2 = data2;
        this.data3 = data3;
    }
}

class Child extends Parent{
    int data1 = 2;

    public Child(int data2, int data3, int data1) {
        super(data2, data3); //부모생성자 호출
        this.data1 = data1;
    }

    public Child() {
        this(100,200,300);
    }

    void childTest(){
        System.out.println("data : "+data1);
        System.out.println("this data : "+this.data1);
        System.out.println("super data2 : "+super.data2);
        System.out.println("super data3 : "+super.data3);
    }
}