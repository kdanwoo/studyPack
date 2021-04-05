package inheritance;

class Weapon {
    private int a = 10;
    public int b = 20;
}

class Gun extends Weapon{
    public int c = 30;
    void display(){
        System.out.println(b); // 상속받은 public 필드
        System.out.println(this.b);
        System.out.println(super.b); // 자식클래스에서 선언한 public 필드
    }
}

public class Inheritance01 {
    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.display();
    }
}
