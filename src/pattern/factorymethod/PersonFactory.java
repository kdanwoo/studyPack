package pattern.factorymethod;

public class PersonFactory {
    public static Person getPerson(PersonData data, String name, int age, String sex){
        if(PersonData.KATE.equals(data)){
            return new KatePerson(name, age, sex);
        }else if(PersonData.DAVID.equals(data)){
            return new DavidPerson(name, age, sex);
        }
        return null;
    }
}
