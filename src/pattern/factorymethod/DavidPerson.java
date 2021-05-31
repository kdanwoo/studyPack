package pattern.factorymethod;

public class DavidPerson extends Person{
    private String name;
    private int age;
    private String sex;

    public DavidPerson(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getSex() {
        return this.sex;
    }
}
