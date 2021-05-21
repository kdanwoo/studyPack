package abstarctTest;

public abstract class Car {

    public String userName;

    public abstract void drive();
    public abstract void tunroff();
    public abstract void showUser();
    public abstract void manufacturer();
    public abstract void changeUserName(String name);

    final public void run(){ //final 선언으로 오버라이딩(재정의)불가
        drive();
        tunroff();
        showUser();
        manufacturer();
        System.out.println("===============");
    }

}
