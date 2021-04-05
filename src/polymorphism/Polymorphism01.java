package polymorphism;

class Animal{}
class Dog extends Animal{
    int a = 10;
}
public class Polymorphism01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animal1 =  new Dog();
        //Dog dog1 = new Animal(); 오류발생
    }
}
