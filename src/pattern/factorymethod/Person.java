package pattern.factorymethod;

public abstract class Person {
    public abstract String getName();
    public abstract int getAge();
    public abstract String getSex();

    @Override
    public String toString() {
        return "NAME="+this.getName()+", AGE="+this.getAge()+", SEX="+this.getSex();
    }
}
