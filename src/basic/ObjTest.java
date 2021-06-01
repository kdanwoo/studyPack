package basic;

class Obj1 {
    private String name;

    @Override
    public String toString() {
        return "Obj1{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ObjTest {
    public static void main(String[] args) {
        Obj1 obj1 = new Obj1();
        System.out.println(obj1); // invokes obj1.toString()
    }
}
