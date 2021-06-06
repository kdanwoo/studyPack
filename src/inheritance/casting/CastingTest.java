package inheritance.casting;

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    String dept;

    public Student(String name) {
        super(name);
    }
}

public class CastingTest {

    //Student 클래스 객체가 생성되면 dept, name을 다 가지고 있음
    Student student = new Student("danwoo");
}
