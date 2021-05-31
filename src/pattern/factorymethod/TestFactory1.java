package pattern.factorymethod;

public class TestFactory1 {
    public static void main(String[] args) {
        Person katePerson = PersonFactory.getPerson(PersonData.KATE,"kate",22,"Female");
        Person DavidPerson = PersonFactory.getPerson(PersonData.DAVID,"david",20,"male");
        System.out.println("Factory katePerson Config::"+katePerson);
        System.out.println("Factory DavidPerson Config::"+DavidPerson);
    }
}
