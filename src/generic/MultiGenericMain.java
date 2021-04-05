package generic;

public class MultiGenericMain {
    public static void main(String[] args) {
        MultiGeneric<String, Integer> multiGeneric = new MultiGeneric<String, Integer>();
        multiGeneric.sample = "String type";
        multiGeneric.Sample2 = 23;
    }
}
