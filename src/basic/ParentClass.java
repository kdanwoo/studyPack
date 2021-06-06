package basic;

public class ParentClass {
    private String data1;
    private String data2;

    public ParentClass(String data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public ParentClass() {
        this.data1 = "data1";
        this.data2 = "data2";
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "data1='" + data1 + '\'' +
                ", data2='" + data2 + '\'' +
                '}';
    }
}
