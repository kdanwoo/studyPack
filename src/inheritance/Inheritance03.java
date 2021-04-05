package inheritance;

class Animal {
    int countlegs = 4;
}
class Bird extends Animal{

    int countlegs = 2;

    void display(){
        System.out.println(countlegs);
        System.out.println(this.countlegs);
        System.out.println(super.countlegs);
    }
}
public class Inheritance03 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.display();
    }
}
