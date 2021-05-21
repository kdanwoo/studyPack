package abstarctTest;

public class Sorento extends Car{

    public Sorento(String name) {
        this.userName = name;
    }

    @Override
    public void drive() {
        System.out.println("Sorento drive!");
    }

    public void turnOnLight() { //Car 클래스에 정의되어 있지 않은 메소드 (공통 메서드 x)
        System.out.println("Sorento turn on Light!");
    }

    @Override
    public void tunroff() {
        System.out.println("Sorento tunroff!");
    }

    @Override
    public void showUser() {
        System.out.println("Sorento Owner : " + this.userName);
    }

    @Override
    public void manufacturer() {
        System.out.println("Sorento made by KIA!");
    }

    @Override
    public void changeUserName(String name) {
        this.userName = name;
    }


}
