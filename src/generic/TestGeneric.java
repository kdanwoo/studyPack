package generic;

public class TestGeneric<T> {
    public T sample;

    public void showType(){
        if(sample instanceof Integer){
            System.out.println("Integer type");
        }
        else if(sample instanceof String){
            System.out.println("String type");
        }
    }
}
