package polymorphism;

class Car{
    public void drive(){
        System.out.println("CAR START");
    }
}
class Sorento extends Car{

    @Override
    public void drive() {
        //super.drive(); //부모클래스의 메소드를 바로 사용하는 것. super예약어 사용
        System.out.println("SORENTO START");
    }

    public void stop(){
        System.out.println("STOP");
    }

}

public class PolymorphismTest {
    public static void main(String[] args) {

        Car car = new Sorento();
        //Car 클래스를 상속받은 Sorento클래스 더 큰 개념의 객체다.

        //Sorento sorento = new Car();
        //Car 객체가 Sorento 객체보다 작은 개념이기때문에 위의 방식의 생성은 불가능

        car.drive(); //SORENTO 클래스로 생성했기때문에 SORENTO객체의 drive 메소드 호출

    }
}
