package generic;

public class GenericMethodDataMain {
    public static void main(String[] args) {
        GenericMethodData.<String>showData("hello");
        GenericMethodData.showData(1);
        GenericMethodData.showData(1.0);
    }
}
