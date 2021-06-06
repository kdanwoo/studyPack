package basic;

public class Human {
    private String name;
    private int age;
    private String job;

    public Human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    Human(){
        this("kim",30,"student");
    }

    public String getName(){
        return this.name;
    }
}
