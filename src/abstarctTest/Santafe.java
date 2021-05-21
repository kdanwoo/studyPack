package abstarctTest;

public class Santafe extends Car{


    public Santafe(String name) {
        this.userName = name;
    }

    @Override
    public void drive() {
        System.out.println("Santafe drive!");
    }

    @Override
    public void tunroff() {
        System.out.println("Santafe tunroff!");
    }

    @Override
    public void showUser() {
        System.out.println("Santafe Owner : " + this.userName);
    }

    @Override
    public void manufacturer() {
        System.out.println("Santafe made by HYUNDAI!");
    }

    @Override
    public void changeUserName(String name) {
        this.userName = name;
    }


}
