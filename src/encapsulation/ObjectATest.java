package encapsulation;

public class ObjectATest {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        objectA.setAge(11);
        objectA.setName("david");

        System.out.println(objectA.getAge());
        System.out.println(objectA.getName());
    }
}
